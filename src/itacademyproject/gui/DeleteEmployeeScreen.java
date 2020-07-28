package itacademyproject.gui;

import itacademyproject.data.EmployeeItem;
import itacademyproject.slq.DatabaseManager;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class DeleteEmployeeScreen extends javax.swing.JFrame {

    private EmployeeItem[] employees;

    private Color deleteEmployeeScreenBackLabelNormalColor, deleteEmployeeScreenBackLabelHighlightColor;

    public DeleteEmployeeScreen() {
        initComponents();
        initialize();
    }

    @Override
    public void setVisible(boolean b) {

        super.setVisible(b);

        if (DatabaseManager.employees.getEmployeeCount() == 0) {
            this.dispose();

            JOptionPane.showMessageDialog(null, "Please add some employees before deleting them!");

            new MainMenuScreen().setVisible(true);
        }

    }

    private void initialize() {

        if (DatabaseManager.employees.getEmployeeCount() > 0) {
            employees = DatabaseManager.employees.getAllEmployees();
            employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.employees.getAllEmployeesFormatted()));

            deleteEmployeeScreenBackLabelNormalColor = deleteEmployeeScreenBackLabel.getForeground();
            deleteEmployeeScreenBackLabelHighlightColor = Color.black;
            
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/itacademyproject/pics/icon_64x64.png")));
        }

    }

    private void updateUI() {
        if (DatabaseManager.employees.getEmployeeCount() == 0) {
            this.dispose();

            JOptionPane.showMessageDialog(null, "You have deleted all employees");

            new MainMenuScreen().setVisible(true);
        }

        employees = DatabaseManager.employees.getAllEmployees();
        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.employees.getAllEmployeesFormatted()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        selectEmployeeLabel = new javax.swing.JLabel();
        employeeComboBox = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        deleteEmployeeScreenBackLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Employee Screen");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("Delete Employee");

        selectEmployeeLabel.setText("Select An Employee To Delete");
        selectEmployeeLabel.setToolTipText("");

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/x_16x16.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        deleteEmployeeScreenBackLabel.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        deleteEmployeeScreenBackLabel.setForeground(new java.awt.Color(51, 51, 51));
        deleteEmployeeScreenBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/back_16x16.png"))); // NOI18N
        deleteEmployeeScreenBackLabel.setText("Back");
        deleteEmployeeScreenBackLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteEmployeeScreenBackLabelMouseMoved(evt);
            }
        });
        deleteEmployeeScreenBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteEmployeeScreenBackLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteEmployeeScreenBackLabelMousePressed(evt);
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
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectEmployeeLabel)
                        .addGap(27, 27, 27)
                        .addComponent(employeeComboBox, 0, 290, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteEmployeeScreenBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addGap(151, 151, 151)))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel)
                    .addComponent(deleteEmployeeScreenBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectEmployeeLabel)
                    .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        EmployeeItem selectedEmployee = employees[employeeComboBox.getSelectedIndex()];

        int employeeIDToDelete = DatabaseManager.employees.getIDFromName(selectedEmployee.getFirstName(), selectedEmployee.getLastName());

        DatabaseManager.employees.deleteEmployee(employeeIDToDelete);

        JOptionPane.showMessageDialog(null, "Employee successfully deleted!");

        updateUI();


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void deleteEmployeeScreenBackLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEmployeeScreenBackLabelMouseMoved
        deleteEmployeeScreenBackLabel.setForeground(deleteEmployeeScreenBackLabelHighlightColor);
    }//GEN-LAST:event_deleteEmployeeScreenBackLabelMouseMoved

    private void deleteEmployeeScreenBackLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEmployeeScreenBackLabelMouseExited
        deleteEmployeeScreenBackLabel.setForeground(deleteEmployeeScreenBackLabelNormalColor);
    }//GEN-LAST:event_deleteEmployeeScreenBackLabelMouseExited

    private void deleteEmployeeScreenBackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEmployeeScreenBackLabelMousePressed
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_deleteEmployeeScreenBackLabelMousePressed

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
//            java.util.logging.Logger.getLogger(DeleteEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DeleteEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DeleteEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DeleteEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DeleteEmployeeScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel deleteEmployeeScreenBackLabel;
    private javax.swing.JComboBox<String> employeeComboBox;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuExit;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel selectEmployeeLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
