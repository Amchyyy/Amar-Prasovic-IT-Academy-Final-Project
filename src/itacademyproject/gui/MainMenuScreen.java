package itacademyproject.gui;

import javax.swing.JFrame;
import itacademyproject.data.*;
import java.awt.Toolkit;

public class MainMenuScreen extends JFrame {

    public MainMenuScreen() {
        initComponents();
        initialize();
    }

    private void initialize() {
        welcomeUserLabel.setText(String.format("Welcome , %s !", SharedData.getCurrentUser().getUserName()));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/itacademyproject/pics/icon_64x64.png")));
    }

    private void updateUI() {
        welcomeUserLabel.setText(String.format("Welcome , %s !", SharedData.getCurrentUser().getUserName()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jMenuItem1 = new javax.swing.JMenuItem();
        titleLabel = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        welcomeUserLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        addNewJob = new javax.swing.JButton();
        editEmployeeButton = new javax.swing.JButton();
        editJobButton = new javax.swing.JButton();
        deleteEmployeeButton = new javax.swing.JButton();
        deleteJobButton = new javax.swing.JButton();
        addEmployeeButton = new javax.swing.JButton();
        showEmployeeDataButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitFileMenu = new javax.swing.JMenuItem();
        navigateMenu = new javax.swing.JMenu();
        navigateMenuAddMenu = new javax.swing.JMenu();
        navigateMenuAddMenuAddNewEmployeeItem = new javax.swing.JMenuItem();
        navigateMenuAddMenuAddNewJobItem = new javax.swing.JMenuItem();
        navigateMenuEditMenu = new javax.swing.JMenu();
        navigateMenuEditMenuEditEmployeeItem = new javax.swing.JMenuItem();
        navigateMenuEditMenuEditJobItem = new javax.swing.JMenuItem();
        navigateMenuDeleteMenu = new javax.swing.JMenu();
        navigateMenuDeleteMenuDeleteEmployeeItem = new javax.swing.JMenuItem();
        navigateMenuDeleteMenuDeleteJobItem = new javax.swing.JMenuItem();
        navigateMenuShowMenu = new javax.swing.JMenu();
        navigateMenuShowMenuEmployeeDataItem = new javax.swing.JMenuItem();
        navigateMenuOtherMenu = new javax.swing.JMenu();
        navigateMenuOtherMenuWelcomeItem = new javax.swing.JMenuItem();
        navigateMenuOtherMenuLoginItem = new javax.swing.JMenuItem();
        navigateMenuOtherMenuRegisterItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu Screen");
        setBackground(new java.awt.Color(175, 175, 175));
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setText("EMPLOYEE MANAGEMENT SYSTEM");

        userPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        welcomeUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/person_16x16.png"))); // NOI18N
        welcomeUserLabel.setText("Welcome , Amar 123");

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        welcomeUserLabel.getAccessibleContext().setAccessibleName("Welcome , amar1232342342");

        buttonPanel.setBackground(new java.awt.Color(235, 235, 235));
        buttonPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addNewJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/briefcase_16x16.png"))); // NOI18N
        addNewJob.setText("Add New Job");
        addNewJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewJobActionPerformed(evt);
            }
        });

        editEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/edit_employee_16x16.png"))); // NOI18N
        editEmployeeButton.setText("Edit Employee");
        editEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeButtonActionPerformed(evt);
            }
        });

        editJobButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/edit_job_16x16.png"))); // NOI18N
        editJobButton.setText("Edit Job");
        editJobButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobButtonActionPerformed(evt);
            }
        });

        deleteEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/delete_employee_16x16.png"))); // NOI18N
        deleteEmployeeButton.setText("Delete Employee");
        deleteEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeButtonActionPerformed(evt);
            }
        });

        deleteJobButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/delete_job_16x16.png"))); // NOI18N
        deleteJobButton.setText("Delete Job");
        deleteJobButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJobButtonActionPerformed(evt);
            }
        });

        addEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/add_person_16x16.png"))); // NOI18N
        addEmployeeButton.setText("Add New Employee");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        showEmployeeDataButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/show_16x16.png"))); // NOI18N
        showEmployeeDataButton.setText("Show Employee Data");
        showEmployeeDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEmployeeDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(showEmployeeDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addNewJob, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 140, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewJob, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(showEmployeeDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        exitFileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/exit_16x16.png"))); // NOI18N
        exitFileMenu.setText("Exit");
        exitFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileMenuActionPerformed(evt);
            }
        });
        fileMenu.add(exitFileMenu);

        menuBar.add(fileMenu);

        navigateMenu.setText("Navigate");

        navigateMenuAddMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/add_16x16.png"))); // NOI18N
        navigateMenuAddMenu.setText("Add Screens");

        navigateMenuAddMenuAddNewEmployeeItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/add_person_16x16.png"))); // NOI18N
        navigateMenuAddMenuAddNewEmployeeItem.setText("Add New Employee");
        navigateMenuAddMenuAddNewEmployeeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuAddMenuAddNewEmployeeItemActionPerformed(evt);
            }
        });
        navigateMenuAddMenu.add(navigateMenuAddMenuAddNewEmployeeItem);

        navigateMenuAddMenuAddNewJobItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/briefcase_16x16.png"))); // NOI18N
        navigateMenuAddMenuAddNewJobItem.setText("Add New Job");
        navigateMenuAddMenuAddNewJobItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuAddMenuAddNewJobItemActionPerformed(evt);
            }
        });
        navigateMenuAddMenu.add(navigateMenuAddMenuAddNewJobItem);

        navigateMenu.add(navigateMenuAddMenu);

        navigateMenuEditMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/edit_16x16.png"))); // NOI18N
        navigateMenuEditMenu.setText("Edit Screens");

        navigateMenuEditMenuEditEmployeeItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/edit_employee_16x16.png"))); // NOI18N
        navigateMenuEditMenuEditEmployeeItem.setText("Edit Employee");
        navigateMenuEditMenuEditEmployeeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuEditMenuEditEmployeeItemActionPerformed(evt);
            }
        });
        navigateMenuEditMenu.add(navigateMenuEditMenuEditEmployeeItem);

        navigateMenuEditMenuEditJobItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/edit_job_16x16.png"))); // NOI18N
        navigateMenuEditMenuEditJobItem.setText("Edit Job");
        navigateMenuEditMenuEditJobItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuEditMenuEditJobItemActionPerformed(evt);
            }
        });
        navigateMenuEditMenu.add(navigateMenuEditMenuEditJobItem);

        navigateMenu.add(navigateMenuEditMenu);

        navigateMenuDeleteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/x_16x16.png"))); // NOI18N
        navigateMenuDeleteMenu.setText("Delete Screens");

        navigateMenuDeleteMenuDeleteEmployeeItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/delete_employee_16x16.png"))); // NOI18N
        navigateMenuDeleteMenuDeleteEmployeeItem.setText("Delete Employee");
        navigateMenuDeleteMenuDeleteEmployeeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuDeleteMenuDeleteEmployeeItemActionPerformed(evt);
            }
        });
        navigateMenuDeleteMenu.add(navigateMenuDeleteMenuDeleteEmployeeItem);

        navigateMenuDeleteMenuDeleteJobItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/delete_job_16x16.png"))); // NOI18N
        navigateMenuDeleteMenuDeleteJobItem.setText("Delete Job");
        navigateMenuDeleteMenuDeleteJobItem.setToolTipText("");
        navigateMenuDeleteMenuDeleteJobItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuDeleteMenuDeleteJobItemActionPerformed(evt);
            }
        });
        navigateMenuDeleteMenu.add(navigateMenuDeleteMenuDeleteJobItem);

        navigateMenu.add(navigateMenuDeleteMenu);

        navigateMenuShowMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/eye_16x16.png"))); // NOI18N
        navigateMenuShowMenu.setText("Show Data Screens");

        navigateMenuShowMenuEmployeeDataItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/show_16x16.png"))); // NOI18N
        navigateMenuShowMenuEmployeeDataItem.setText("Show Employee Data");
        navigateMenuShowMenuEmployeeDataItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuShowMenuEmployeeDataItemActionPerformed(evt);
            }
        });
        navigateMenuShowMenu.add(navigateMenuShowMenuEmployeeDataItem);

        navigateMenu.add(navigateMenuShowMenu);

        navigateMenuOtherMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/grid_16x16.png"))); // NOI18N
        navigateMenuOtherMenu.setText("Other Screens");

        navigateMenuOtherMenuWelcomeItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/home_16x16.png"))); // NOI18N
        navigateMenuOtherMenuWelcomeItem.setText("Welcome Screen");
        navigateMenuOtherMenuWelcomeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuOtherMenuWelcomeItemActionPerformed(evt);
            }
        });
        navigateMenuOtherMenu.add(navigateMenuOtherMenuWelcomeItem);

        navigateMenuOtherMenuLoginItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/person_16x16.png"))); // NOI18N
        navigateMenuOtherMenuLoginItem.setText("Login Screen");
        navigateMenuOtherMenuLoginItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuOtherMenuLoginItemActionPerformed(evt);
            }
        });
        navigateMenuOtherMenu.add(navigateMenuOtherMenuLoginItem);

        navigateMenuOtherMenuRegisterItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/add_person_16x16.png"))); // NOI18N
        navigateMenuOtherMenuRegisterItem.setText("Register Screen");
        navigateMenuOtherMenuRegisterItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuOtherMenuRegisterItemActionPerformed(evt);
            }
        });
        navigateMenuOtherMenu.add(navigateMenuOtherMenuRegisterItem);

        navigateMenu.add(navigateMenuOtherMenu);

        menuBar.add(navigateMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleLabel))
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitFileMenuActionPerformed

    private void navigateMenuOtherMenuWelcomeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuOtherMenuWelcomeItemActionPerformed
        this.dispose();
        new WelcomeScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuOtherMenuWelcomeItemActionPerformed

    private void navigateMenuOtherMenuLoginItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuOtherMenuLoginItemActionPerformed
        this.dispose();
        new LoginScreen().setVisible(true);

    }//GEN-LAST:event_navigateMenuOtherMenuLoginItemActionPerformed

    private void navigateMenuOtherMenuRegisterItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuOtherMenuRegisterItemActionPerformed
        this.dispose();
        new RegisterScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuOtherMenuRegisterItemActionPerformed

    private void addNewJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewJobActionPerformed
        this.dispose();
        new AddNewJobScreen().setVisible(true);

    }//GEN-LAST:event_addNewJobActionPerformed

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        this.dispose();
        new AddNewEmployeeScreen().setVisible(true);
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void editEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeButtonActionPerformed
        this.dispose();
        new EditEmployeeScreen().setVisible(true);
    }//GEN-LAST:event_editEmployeeButtonActionPerformed

    private void editJobButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobButtonActionPerformed
        this.dispose();
        new EditJobScreen().setVisible(true);
    }//GEN-LAST:event_editJobButtonActionPerformed

    private void deleteEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeButtonActionPerformed
        this.dispose();
        new DeleteEmployeeScreen().setVisible(true);
    }//GEN-LAST:event_deleteEmployeeButtonActionPerformed

    private void showEmployeeDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEmployeeDataButtonActionPerformed
        this.dispose();
        new EmployeeDataScreen().setVisible(true);
    }//GEN-LAST:event_showEmployeeDataButtonActionPerformed

    private void deleteJobButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJobButtonActionPerformed
        this.dispose();
        new DeleteJobScreen().setVisible(true);
    }//GEN-LAST:event_deleteJobButtonActionPerformed

    private void navigateMenuAddMenuAddNewEmployeeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuAddMenuAddNewEmployeeItemActionPerformed
        this.dispose();
        new AddNewEmployeeScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuAddMenuAddNewEmployeeItemActionPerformed

    private void navigateMenuAddMenuAddNewJobItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuAddMenuAddNewJobItemActionPerformed
        this.dispose();
        new AddNewJobScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuAddMenuAddNewJobItemActionPerformed

    private void navigateMenuEditMenuEditEmployeeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuEditMenuEditEmployeeItemActionPerformed
        this.dispose();
        new EditEmployeeScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuEditMenuEditEmployeeItemActionPerformed

    private void navigateMenuEditMenuEditJobItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuEditMenuEditJobItemActionPerformed
        this.dispose();
        new EditJobScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuEditMenuEditJobItemActionPerformed

    private void navigateMenuDeleteMenuDeleteEmployeeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuDeleteMenuDeleteEmployeeItemActionPerformed
        this.dispose();

        new DeleteEmployeeScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuDeleteMenuDeleteEmployeeItemActionPerformed

    private void navigateMenuDeleteMenuDeleteJobItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuDeleteMenuDeleteJobItemActionPerformed
        this.dispose();
        new DeleteJobScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuDeleteMenuDeleteJobItemActionPerformed

    private void navigateMenuShowMenuEmployeeDataItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuShowMenuEmployeeDataItemActionPerformed
        this.dispose();
        new EmployeeDataScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuShowMenuEmployeeDataItemActionPerformed

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
//            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenuScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JButton addNewJob;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton deleteEmployeeButton;
    private javax.swing.JButton deleteJobButton;
    private javax.swing.JButton editEmployeeButton;
    private javax.swing.JButton editJobButton;
    private javax.swing.JMenuItem exitFileMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu navigateMenu;
    private javax.swing.JMenu navigateMenuAddMenu;
    private javax.swing.JMenuItem navigateMenuAddMenuAddNewEmployeeItem;
    private javax.swing.JMenuItem navigateMenuAddMenuAddNewJobItem;
    private javax.swing.JMenu navigateMenuDeleteMenu;
    private javax.swing.JMenuItem navigateMenuDeleteMenuDeleteEmployeeItem;
    private javax.swing.JMenuItem navigateMenuDeleteMenuDeleteJobItem;
    private javax.swing.JMenu navigateMenuEditMenu;
    private javax.swing.JMenuItem navigateMenuEditMenuEditEmployeeItem;
    private javax.swing.JMenuItem navigateMenuEditMenuEditJobItem;
    private javax.swing.JMenu navigateMenuOtherMenu;
    private javax.swing.JMenuItem navigateMenuOtherMenuLoginItem;
    private javax.swing.JMenuItem navigateMenuOtherMenuRegisterItem;
    private javax.swing.JMenuItem navigateMenuOtherMenuWelcomeItem;
    private javax.swing.JMenu navigateMenuShowMenu;
    private javax.swing.JMenuItem navigateMenuShowMenuEmployeeDataItem;
    private javax.swing.JButton showEmployeeDataButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel welcomeUserLabel;
    // End of variables declaration//GEN-END:variables
}
