package itacademyproject.gui;

import itacademyproject.data.SharedData;
import itacademyproject.data.UserItem;
import itacademyproject.slq.DatabaseManager;
import java.awt.Color;
import javax.swing.JOptionPane;

public class LoginScreen extends javax.swing.JFrame {

    private Color loginScreenBackLabelNormalColor, loginScreenBackLabelHighlightColor;

    public LoginScreen() {
        initComponents();
        initialize();

    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); 
        
        if(DatabaseManager.registeredUsers.getUserCount() == 0)
        {
            this.dispose();
            
            JOptionPane.showMessageDialog(null, "You have no accounts to login to system.Go to 'Register Screen' and add an account!");
            
            new RegisterScreen().setVisible(true);
        }
        
        
        
    }
    
    

    private void initialize() {
        loginScreenBackLabelNormalColor = loginScreenBackLabel.getForeground();
        loginScreenBackLabelHighlightColor = Color.black;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        titleLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        togglePasswordVisibilityButton = new javax.swing.JToggleButton();
        loginScreenBackLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        backFileMenu = new javax.swing.JMenuItem();
        exitFileMenu = new javax.swing.JMenuItem();
        navigateMenu = new javax.swing.JMenu();
        navigateMenuWelcomeScreenItem = new javax.swing.JMenuItem();
        navigateMenuRegisterScreenItem = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Screen");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("LOGIN");

        userNameLabel.setText("Enter username ");

        userNameTextField.setToolTipText("");

        passwordLabel.setText("Enter password");

        passwordTextField.setToolTipText("");

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/person_16x16.png"))); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        togglePasswordVisibilityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/eye_16x16.png"))); // NOI18N
        togglePasswordVisibilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglePasswordVisibilityButtonActionPerformed(evt);
            }
        });

        loginScreenBackLabel.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        loginScreenBackLabel.setForeground(new java.awt.Color(51, 51, 51));
        loginScreenBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/back_16x16.png"))); // NOI18N
        loginScreenBackLabel.setText("Back");
        loginScreenBackLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginScreenBackLabelMouseMoved(evt);
            }
        });
        loginScreenBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginScreenBackLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginScreenBackLabelMousePressed(evt);
            }
        });

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

        navigateMenuRegisterScreenItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/add_person_16x16.png"))); // NOI18N
        navigateMenuRegisterScreenItem.setText("Register Screen");
        navigateMenuRegisterScreenItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuRegisterScreenItemActionPerformed(evt);
            }
        });
        navigateMenu.add(navigateMenuRegisterScreenItem);

        menuBar.add(navigateMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginScreenBackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(userNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordLabel)
                                            .addComponent(userNameLabel))
                                        .addGap(242, 242, 242)))
                                .addGap(18, 18, 18)
                                .addComponent(togglePasswordVisibilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(loginScreenBackLabel))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(togglePasswordVisibilityButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitFileMenuActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        String userName = userNameTextField.getText();
        String password = passwordTextField.getText();

        //JOptionPane.showMessageDialog(null, Integer.toString(getUserCountFromDatabase()));
        if (userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all input fields!");
        } else {
            UserItem user = new UserItem(userName, password);

            if (DatabaseManager.registeredUsers.userExists(user)) {
                JOptionPane.showMessageDialog(null, "Successful login!");

                this.dispose();

                SharedData.setCurrentUser(user);

                new MainMenuScreen().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "This user does not exist!");
            }

        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void togglePasswordVisibilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglePasswordVisibilityButtonActionPerformed

        if (togglePasswordVisibilityButton.isSelected()) {
            passwordTextField.setEchoChar((char) 0);
        } else {
            passwordTextField.setEchoChar('*');
        }
    }//GEN-LAST:event_togglePasswordVisibilityButtonActionPerformed

    private void loginScreenBackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginScreenBackLabelMousePressed
        this.dispose();
        new WelcomeScreen().setVisible(true);
    }//GEN-LAST:event_loginScreenBackLabelMousePressed

    private void loginScreenBackLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginScreenBackLabelMouseMoved
        loginScreenBackLabel.setForeground(loginScreenBackLabelHighlightColor);
    }//GEN-LAST:event_loginScreenBackLabelMouseMoved

    private void loginScreenBackLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginScreenBackLabelMouseExited

        loginScreenBackLabel.setForeground(loginScreenBackLabelNormalColor);

    }//GEN-LAST:event_loginScreenBackLabelMouseExited

    private void navigateMenuWelcomeScreenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuWelcomeScreenItemActionPerformed

        this.dispose();

        new WelcomeScreen().setVisible(true);

    }//GEN-LAST:event_navigateMenuWelcomeScreenItemActionPerformed

    private void navigateMenuRegisterScreenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuRegisterScreenItemActionPerformed

        this.dispose();

        new RegisterScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuRegisterScreenItemActionPerformed

    private void backFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backFileMenuActionPerformed
        this.dispose();

        new WelcomeScreen().setVisible(true);
    }//GEN-LAST:event_backFileMenuActionPerformed

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
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem backFileMenu;
    private javax.swing.JMenuItem exitFileMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginScreenBackLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu navigateMenu;
    private javax.swing.JMenuItem navigateMenuRegisterScreenItem;
    private javax.swing.JMenuItem navigateMenuWelcomeScreenItem;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JToggleButton togglePasswordVisibilityButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
