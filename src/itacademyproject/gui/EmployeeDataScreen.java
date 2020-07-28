package itacademyproject.gui;

import itacademyproject.data.EmployeeItem;
import itacademyproject.slq.DatabaseManager;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeDataScreen extends javax.swing.JFrame {

    private EmployeeItem[] employees;
    private Color employeeDataScreenBackLabelNormalColor, employeeDataScreenBackLabelHighlightColor;

    public EmployeeDataScreen() {
        initComponents();
        initialize();
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);

        if (DatabaseManager.employees.getEmployeeCount() == 0) {
            this.dispose();

            JOptionPane.showMessageDialog(null, "You need to first add some employees!");

            new MainMenuScreen().setVisible(true);

            employeeDataScreenBackLabelNormalColor = employeeDataScreenBackLabel.getForeground();
            employeeDataScreenBackLabelHighlightColor = Color.black;
        }

    }

    private void initialize() {
        if (DatabaseManager.employees.getEmployeeCount() > 0) {

            employees = DatabaseManager.employees.getAllEmployees();

            for (int i = 0; i < DatabaseManager.employees.getEmployeeCount(); i++) {
                DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
                model.addRow(new Object[]{employees[i].getFirstName() + " " + employees[i].getLastName(),
                    Integer.toString(employees[i].getAge()), employees[i].getPhoneNumber(),
                    employees[i].getEmail(),
                    employees[i].getLocationItem().getCountryName() + ", " + employees[i].getLocationItem().getAdress(),
                    employees[i].getJob().getName() + ", " + employees[i].getJob().getSalary()});
                
                setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/itacademyproject/pics/icon_64x64.png")));

            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        employeeTableScrollPane = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        employeeDataScreenBackLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Data Screen");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("Employee Data ");

        employeeTableScrollPane.setBorder(null);

        employeeTable.setAutoCreateRowSorter(true);
        employeeTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Employee Age", "Empoloyee Phone Number", "Employee Email", "Employee Location", "Employee Job"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTableScrollPane.setViewportView(employeeTable);

        employeeDataScreenBackLabel.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        employeeDataScreenBackLabel.setForeground(new java.awt.Color(51, 51, 51));
        employeeDataScreenBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/back_16x16.png"))); // NOI18N
        employeeDataScreenBackLabel.setText("Back");
        employeeDataScreenBackLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                employeeDataScreenBackLabelMouseMoved(evt);
            }
        });
        employeeDataScreenBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeDataScreenBackLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                employeeDataScreenBackLabelMouseExited(evt);
            }
        });

        fileMenu.setText("File");

        fileMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/exit_16x16.png"))); // NOI18N
        fileMenuExit.setText("Exit");
        fileMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuExitActionPerformed(evt);
            }
        });
        fileMenu.add(fileMenuExit);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(employeeDataScreenBackLabel)
                        .addGap(302, 302, 302)
                        .addComponent(titleLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(employeeDataScreenBackLabel))
                .addGap(36, 36, 36)
                .addComponent(employeeTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeeDataScreenBackLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeDataScreenBackLabelMouseMoved
        employeeDataScreenBackLabel.setForeground(employeeDataScreenBackLabelHighlightColor);
    }//GEN-LAST:event_employeeDataScreenBackLabelMouseMoved

    private void employeeDataScreenBackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeDataScreenBackLabelMouseClicked
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_employeeDataScreenBackLabelMouseClicked

    private void employeeDataScreenBackLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeDataScreenBackLabelMouseExited
        employeeDataScreenBackLabel.setForeground(employeeDataScreenBackLabelNormalColor);
    }//GEN-LAST:event_employeeDataScreenBackLabelMouseExited

    private void fileMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuExitActionPerformed
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_fileMenuExitActionPerformed

//    public static void main(String args[]) {
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EmployeeDataScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EmployeeDataScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EmployeeDataScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EmployeeDataScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EmployeeDataScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel employeeDataScreenBackLabel;
    private javax.swing.JTable employeeTable;
    private javax.swing.JScrollPane employeeTableScrollPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuExit;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
