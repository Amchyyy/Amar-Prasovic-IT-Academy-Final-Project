package itacademyproject.gui;

import itacademyproject.data.JobItem;
import itacademyproject.slq.DatabaseManager;
import java.awt.Color;
import javax.swing.JOptionPane;

public class EditJobScreen extends javax.swing.JFrame {

    private JobItem[] jobs;
    private Color editJobScreenBackLabelNormalColor, editJobScreenBackLabelHighlightColor;
    private int selectedJobIndex;

    public EditJobScreen() {
        initComponents();
        initialize();
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);

        if (DatabaseManager.jobs.getJobCount() == 0) {
            this.dispose();

            JOptionPane.showMessageDialog(null, "Please add some jobs before editing them!");

            new MainMenuScreen().setVisible(true);
        }
    }

    private void initialize() {

        if (DatabaseManager.jobs.getJobCount() > 0) {
            jobs = DatabaseManager.jobs.getAllJobs();

            jobsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.jobs.getAllJobsFormatted()));
            jobsComboBox.setSelectedIndex(0);

            editJobScreenBackLabelNormalColor = editJobScreenBackLabel.getForeground();
            editJobScreenBackLabelHighlightColor = Color.black;
        }

    }

    private void updateUI() {
        jobs = DatabaseManager.jobs.getAllJobs();
        jobsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.jobs.getAllJobsFormatted()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jobNameLabel = new javax.swing.JLabel();
        jobNameTextField = new javax.swing.JTextField();
        jobSalaryLabel = new javax.swing.JLabel();
        jobSalaryTextField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        selectJobLabel = new javax.swing.JLabel();
        jobsComboBox = new javax.swing.JComboBox<>();
        clearButton = new javax.swing.JButton();
        editJobScreenBackLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Job Screen");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("Edit Job");

        jobNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jobNameLabel.setText("Job name");

        jobSalaryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jobSalaryLabel.setText("Job sallary");

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/edit_16x16.png"))); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        selectJobLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectJobLabel.setText("Select a job to edit");

        jobsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobsComboBoxActionPerformed(evt);
            }
        });

        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/clear_16x16.png"))); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        editJobScreenBackLabel.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        editJobScreenBackLabel.setForeground(new java.awt.Color(51, 51, 51));
        editJobScreenBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/back_16x16.png"))); // NOI18N
        editJobScreenBackLabel.setText("Back");
        editJobScreenBackLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                editJobScreenBackLabelMouseMoved(evt);
            }
        });
        editJobScreenBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editJobScreenBackLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editJobScreenBackLabelMousePressed(evt);
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
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editJobScreenBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addGap(262, 262, 262))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jobSalaryLabel)
                            .addComponent(jobNameLabel)
                            .addComponent(selectJobLabel))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jobsComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 332, Short.MAX_VALUE)
                            .addComponent(jobNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jobSalaryTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(editJobScreenBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectJobLabel)
                    .addComponent(jobsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobNameLabel)
                    .addComponent(jobNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobSalaryLabel)
                    .addComponent(jobSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

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

            int jobIDToUpdate = DatabaseManager.jobs.getIDFromName(getJobNameFromJobComboBox(selectedJobIndex));

            DatabaseManager.jobs.updateJob(jobIDToUpdate, job);

            updateUI();

            JOptionPane.showMessageDialog(null, "Succeessfull edit!");

        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void jobsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobsComboBoxActionPerformed
        selectedJobIndex = jobsComboBox.getSelectedIndex();
        JobItem selectedJob = jobs[selectedJobIndex];

        jobNameTextField.setText(selectedJob.getName());
        jobSalaryTextField.setText(Double.toString(selectedJob.getSalary()));
    }//GEN-LAST:event_jobsComboBoxActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        jobNameTextField.setText("");
        jobSalaryTextField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void editJobScreenBackLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editJobScreenBackLabelMouseMoved
        editJobScreenBackLabel.setForeground(editJobScreenBackLabelHighlightColor);
    }//GEN-LAST:event_editJobScreenBackLabelMouseMoved

    private void editJobScreenBackLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editJobScreenBackLabelMouseExited
        editJobScreenBackLabel.setForeground(editJobScreenBackLabelNormalColor);
    }//GEN-LAST:event_editJobScreenBackLabelMouseExited

    private void editJobScreenBackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editJobScreenBackLabelMousePressed
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_editJobScreenBackLabelMousePressed

    private void fileMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuExitActionPerformed
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_fileMenuExitActionPerformed

    private String getJobNameFromJobComboBox(int index) {
        for (int i = 0; i < jobsComboBox.getItemCount(); i++) {
            if (index == i) {
                jobsComboBox.setSelectedIndex(i);

                String jobName = jobsComboBox.getItemAt(i);

                jobName = jobName.substring(0, jobName.indexOf(","));

                return jobName;
            }

        }

        return "";
    }

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
//            java.util.logging.Logger.getLogger(EditJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditJobScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditJobScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel editJobScreenBackLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuExit;
    private javax.swing.JLabel jobNameLabel;
    private javax.swing.JTextField jobNameTextField;
    private javax.swing.JLabel jobSalaryLabel;
    private javax.swing.JTextField jobSalaryTextField;
    private javax.swing.JComboBox<String> jobsComboBox;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel selectJobLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
