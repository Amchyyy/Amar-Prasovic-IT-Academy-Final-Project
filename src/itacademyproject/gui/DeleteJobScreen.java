package itacademyproject.gui;

import itacademyproject.data.JobItem;
import itacademyproject.slq.DatabaseManager;
import java.awt.Color;
import javax.swing.JOptionPane;

public class DeleteJobScreen extends javax.swing.JFrame {

    private JobItem[] jobs;

    private Color deleteJobScreenBackLabelNormalColor, deleteJobScreenBackLabelHighlightColor;

    public DeleteJobScreen() {
        initComponents();
        initialize();
    }

    @Override
    public void setVisible(boolean b) {

        super.setVisible(b);

        if (DatabaseManager.jobs.getJobCount() == 0) {
            this.dispose();

            JOptionPane.showMessageDialog(null, "Please add some jobs before deleting them!");

            new MainMenuScreen().setVisible(true);
        }

    }

    private void initialize() {

        if (DatabaseManager.jobs.getJobCount() > 0) {
            jobs = DatabaseManager.jobs.getAllJobs();
            jobsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.jobs.getAllJobsFormatted()));

            deleteJobScreenBackLabelNormalColor = deleteJobScreenBackLabel.getForeground();
            deleteJobScreenBackLabelHighlightColor = Color.black;
        }

    }

    private void updateUI() {
        if (DatabaseManager.jobs.getJobCount() == 0) {
            this.dispose();

            JOptionPane.showMessageDialog(null, "You have deleted all jobs");

            new MainMenuScreen().setVisible(true);
        }

        jobs = DatabaseManager.jobs.getAllJobs();
        jobsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.jobs.getAllJobsFormatted()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        selectAJobLabel = new javax.swing.JLabel();
        jobsComboBox = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        deleteJobScreenBackLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Job Screen");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("Delete Job");
        titleLabel.setToolTipText("");

        selectAJobLabel.setText("Select A Job To Delete");
        selectAJobLabel.setToolTipText("");

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/x_16x16.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        deleteJobScreenBackLabel.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        deleteJobScreenBackLabel.setForeground(new java.awt.Color(51, 51, 51));
        deleteJobScreenBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/back_16x16.png"))); // NOI18N
        deleteJobScreenBackLabel.setText("Back");
        deleteJobScreenBackLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteJobScreenBackLabelMouseMoved(evt);
            }
        });
        deleteJobScreenBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteJobScreenBackLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteJobScreenBackLabelMousePressed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteJobScreenBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addGap(227, 227, 227))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectAJobLabel)
                        .addGap(27, 27, 27)
                        .addComponent(jobsComboBox, 0, 325, Short.MAX_VALUE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel)
                    .addComponent(deleteJobScreenBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectAJobLabel)
                    .addComponent(jobsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        JobItem selectedJob = jobs[jobsComboBox.getSelectedIndex()];

        int jobIDToDelete = DatabaseManager.jobs.getIDFromName(selectedJob.getName());

        if (DatabaseManager.jobs.isPossibleToDeleteAJob(jobIDToDelete)) {
            DatabaseManager.jobs.deleteJob(jobIDToDelete);

            JOptionPane.showMessageDialog(null, "Successfully deleted job!");

            updateUI();

        } else {
            JOptionPane.showMessageDialog(null, "You cant delete that job because that job is already assigned to an employee! "
                    + "Go to 'Edit Employee' and make sure that every employee is not using that job!");
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void deleteJobScreenBackLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteJobScreenBackLabelMouseMoved
        deleteJobScreenBackLabel.setForeground(deleteJobScreenBackLabelHighlightColor);
    }//GEN-LAST:event_deleteJobScreenBackLabelMouseMoved

    private void deleteJobScreenBackLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteJobScreenBackLabelMouseExited
        deleteJobScreenBackLabel.setForeground(deleteJobScreenBackLabelNormalColor);
    }//GEN-LAST:event_deleteJobScreenBackLabelMouseExited

    private void deleteJobScreenBackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteJobScreenBackLabelMousePressed
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_deleteJobScreenBackLabelMousePressed

    private void fileMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuExitActionPerformed
        this.dispose();

        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_fileMenuExitActionPerformed
//
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
//            java.util.logging.Logger.getLogger(DeleteJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DeleteJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DeleteJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DeleteJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DeleteJobScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel deleteJobScreenBackLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuExit;
    private javax.swing.JComboBox<String> jobsComboBox;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel selectAJobLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
