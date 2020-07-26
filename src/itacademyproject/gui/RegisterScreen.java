package itacademyproject.gui;

import itacademyproject.data.SharedData;
import itacademyproject.data.UserItem;
import itacademyproject.slq.DatabaseManager;
import java.awt.Color;
import javax.swing.JOptionPane;

public class RegisterScreen extends javax.swing.JFrame {

    private final int MAXIMUM_REGISTRATIONS = 25;
    private Color registerScreenBackLabelNormalColor, registerScreenBackLabelHighlightColor;

    public RegisterScreen() {
        initComponents();
        initialize();
    }

    private void initialize() {
        maximumNumberOfRegistrationsWarningLabel.setText("Maximum number of registrated users is : " + MAXIMUM_REGISTRATIONS);
        registredUsersLabel.setText("Registred users : " + DatabaseManager.registeredUsers.getUserCount());

        registerScreenBackLabelNormalColor = registerScreenBackLabel.getForeground();
        registerScreenBackLabelHighlightColor = Color.black;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        maximumNumberOfRegistrationsWarningLabel = new javax.swing.JLabel();
        togglePasswordVisibilityButton = new javax.swing.JToggleButton();
        registerScreenBackLabel = new javax.swing.JLabel();
        registredUsersLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        backFileMenu = new javax.swing.JMenuItem();
        exitFileMenu = new javax.swing.JMenuItem();
        navigateMenu = new javax.swing.JMenu();
        navigateMenuWelcomeScreenItem = new javax.swing.JMenuItem();
        navigateMenuLoginScreen = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register Screen");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("REGISTER");

        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setText("Enter username ");

        userNameTextField.setToolTipText("Every username must be different!");

        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Enter password");

        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/add_person_16x16.png"))); // NOI18N
        registerButton.setText("Register");
        registerButton.setToolTipText("");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        passwordTextField.setToolTipText("");

        maximumNumberOfRegistrationsWarningLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        maximumNumberOfRegistrationsWarningLabel.setForeground(new java.awt.Color(51, 51, 51));
        maximumNumberOfRegistrationsWarningLabel.setText("Maximum number of registrated users is : ");

        togglePasswordVisibilityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/eye_16x16.png"))); // NOI18N
        togglePasswordVisibilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglePasswordVisibilityButtonActionPerformed(evt);
            }
        });

        registerScreenBackLabel.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        registerScreenBackLabel.setForeground(new java.awt.Color(51, 51, 51));
        registerScreenBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/back_16x16.png"))); // NOI18N
        registerScreenBackLabel.setText("Back");
        registerScreenBackLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registerScreenBackLabelMouseMoved(evt);
            }
        });
        registerScreenBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerScreenBackLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerScreenBackLabelMouseExited(evt);
            }
        });

        registredUsersLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        registredUsersLabel.setForeground(new java.awt.Color(51, 51, 51));
        registredUsersLabel.setText("Registared users : 5");
        registredUsersLabel.setToolTipText("");

        fileMenu.setText("File");

        backFileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/back_16x16.png"))); // NOI18N
        backFileMenu.setText("Back");
        backFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backFileMenuActionPerformed(evt);
            }
        });
        fileMenu.add(backFileMenu);

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

        navigateMenuWelcomeScreenItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/home_16x16.png"))); // NOI18N
        navigateMenuWelcomeScreenItem.setText("Welcome Screen");
        navigateMenuWelcomeScreenItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuWelcomeScreenItemActionPerformed(evt);
            }
        });
        navigateMenu.add(navigateMenuWelcomeScreenItem);

        navigateMenuLoginScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/person_16x16.png"))); // NOI18N
        navigateMenuLoginScreen.setText("Login Screen");
        navigateMenuLoginScreen.setToolTipText("");
        navigateMenuLoginScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuLoginScreenActionPerformed(evt);
            }
        });
        navigateMenu.add(navigateMenuLoginScreen);

        menuBar.add(navigateMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(registerButton)
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(togglePasswordVisibilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(registerScreenBackLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(maximumNumberOfRegistrationsWarningLabel)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registredUsersLabel)
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(registerScreenBackLabel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(togglePasswordVisibilityButton)))
                .addGap(34, 34, 34)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maximumNumberOfRegistrationsWarningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registredUsersLabel)
                .addContainerGap())
        );

        maximumNumberOfRegistrationsWarningLabel.getAccessibleContext().setAccessibleName("maximumNumberOfRegistrationsWarningLabel");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed

        String userName = userNameTextField.getText();
        String password = passwordTextField.getText();

        if (DatabaseManager.registeredUsers.getUserCount() >= MAXIMUM_REGISTRATIONS) {
            JOptionPane.showMessageDialog(null, "You can only create maximum of 3 accounts");
        } else if (userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all input fields!");
        } else if (password.length() < 5) {
            JOptionPane.showMessageDialog(null, "Password must me minimun 5 letters long!");
        } else {

            UserItem user = new UserItem(userName, password);

            if (DatabaseManager.registeredUsers.userExists(user)) {
                JOptionPane.showMessageDialog(null, "That username already exists!");
            } else {
                DatabaseManager.registeredUsers.registerUser(user);

                JOptionPane.showMessageDialog(null, "Successfully registred new user!");

                this.dispose();

                SharedData.setCurrentUser(user);

                new MainMenuScreen().setVisible(true);

            }

        }


    }//GEN-LAST:event_registerButtonActionPerformed

    private void backFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backFileMenuActionPerformed
        this.dispose();
        new WelcomeScreen().setVisible(true);
    }//GEN-LAST:event_backFileMenuActionPerformed

    private void exitFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitFileMenuActionPerformed

    private void togglePasswordVisibilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglePasswordVisibilityButtonActionPerformed

        if (togglePasswordVisibilityButton.isSelected()) {
            passwordTextField.setEchoChar((char) 0);
        } else {
            passwordTextField.setEchoChar('*');
        }

    }//GEN-LAST:event_togglePasswordVisibilityButtonActionPerformed

    private void registerScreenBackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerScreenBackLabelMouseClicked
        this.dispose();
        new WelcomeScreen().setVisible(true);
    }//GEN-LAST:event_registerScreenBackLabelMouseClicked

    private void registerScreenBackLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerScreenBackLabelMouseExited
        registerScreenBackLabel.setForeground(registerScreenBackLabelNormalColor);
    }//GEN-LAST:event_registerScreenBackLabelMouseExited

    private void registerScreenBackLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerScreenBackLabelMouseMoved
        registerScreenBackLabel.setForeground(registerScreenBackLabelHighlightColor);
    }//GEN-LAST:event_registerScreenBackLabelMouseMoved

    private void navigateMenuWelcomeScreenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuWelcomeScreenItemActionPerformed
        this.dispose();
        new WelcomeScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuWelcomeScreenItemActionPerformed

    private void navigateMenuLoginScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuLoginScreenActionPerformed
        this.dispose();
        new LoginScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuLoginScreenActionPerformed

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
//            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegisterScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem backFileMenu;
    private javax.swing.JMenuItem exitFileMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel maximumNumberOfRegistrationsWarningLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu navigateMenu;
    private javax.swing.JMenuItem navigateMenuLoginScreen;
    private javax.swing.JMenuItem navigateMenuWelcomeScreenItem;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerScreenBackLabel;
    private javax.swing.JLabel registredUsersLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JToggleButton togglePasswordVisibilityButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
