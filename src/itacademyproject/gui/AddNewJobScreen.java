package itacademyproject.gui;

import javax.swing.JOptionPane;
import itacademyproject.data.*;
import itacademyproject.slq.DatabaseManager;
import java.awt.Color;

public class AddNewJobScreen extends javax.swing.JFrame {

    private Color addNewJobScreenBackLabelNormalColor, addNewJobScreenBackLabelHighlightColor;

    public AddNewJobScreen() {
        initComponents();
        initialize();
    }

    private void initialize() {
        addNewJobScreenBackLabelNormalColor = addNewJobScreenBackLabel.getForeground();
        addNewJobScreenBackLabelHighlightColor = Color.black;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jobNameTextField = new javax.swing.JTextField();
        jobNameLabel = new javax.swing.JLabel();
        jobSalaryLabel = new javax.swing.JLabel();
        jobSalaryTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        addNewJobScreenBackLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Job Screen");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("Add new Job");

        jobNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jobNameLabel.setText("Job name");

        jobSalaryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jobSalaryLabel.setText("Job sallary");

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/save_16x16.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        addNewJobScreenBackLabel.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        addNewJobScreenBackLabel.setForeground(new java.awt.Color(51, 51, 51));
        addNewJobScreenBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/back_16x16.png"))); // NOI18N
        addNewJobScreenBackLabel.setText("Back");
        addNewJobScreenBackLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addNewJobScreenBackLabelMouseMoved(evt);
            }
        });
        addNewJobScreenBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewJobScreenBackLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addNewJobScreenBackLabelMouseExited(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addNewJobScreenBackLabel)
                                .addGap(125, 125, 125)
                                .addComponent(titleLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jobSalaryLabel)
                                    .addComponent(jobNameLabel))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jobNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(jobSalaryTextField))))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addComponent(addNewJobScreenBackLabel))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobNameLabel)
                    .addComponent(jobNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobSalaryLabel)
                    .addComponent(jobSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        String jobName = jobNameTextField.getText();
        double jobSalary = 0;
        try {
            jobSalary = Double.parseDouble(jobSalaryTextField.getText());
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Please enter a valid number as salary!");
            return;
        }

        if (jobName.isEmpty() || jobSalaryTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all input fields!");
        } else {
            JobItem job = new JobItem(jobName, jobSalary);

            if (DatabaseManager.jobs.jobExists(job)) {
                JOptionPane.showMessageDialog(null, "That job already exists");
            } else {
                DatabaseManager.jobs.addJob(job);
                JOptionPane.showMessageDialog(null, "Successfully added a new job");
            }

        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void addNewJobScreenBackLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewJobScreenBackLabelMouseMoved
        addNewJobScreenBackLabel.setForeground(addNewJobScreenBackLabelHighlightColor);
    }//GEN-LAST:event_addNewJobScreenBackLabelMouseMoved

    private void addNewJobScreenBackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewJobScreenBackLabelMouseClicked
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_addNewJobScreenBackLabelMouseClicked

    private void addNewJobScreenBackLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewJobScreenBackLabelMouseExited
        addNewJobScreenBackLabel.setForeground(addNewJobScreenBackLabelNormalColor);
    }//GEN-LAST:event_addNewJobScreenBackLabelMouseExited

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
//            java.util.logging.Logger.getLogger(AddNewJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddNewJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddNewJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddNewJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddNewJobScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addNewJobScreenBackLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuExit;
    private javax.swing.JLabel jobNameLabel;
    private javax.swing.JTextField jobNameTextField;
    private javax.swing.JLabel jobSalaryLabel;
    private javax.swing.JTextField jobSalaryTextField;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
