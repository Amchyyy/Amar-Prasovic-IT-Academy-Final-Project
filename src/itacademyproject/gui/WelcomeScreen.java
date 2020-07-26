package itacademyproject.gui;

public class WelcomeScreen extends javax.swing.JFrame { 

    public WelcomeScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        selectLoginOrRegisterLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitFileMenu = new javax.swing.JMenuItem();
        navigateMenu = new javax.swing.JMenu();
        navigateMenuLoginScreen = new javax.swing.JMenuItem();
        navigateMenuRegisterScreenItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome Screen");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(230, 230, 230));
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setText("WELCOME TO THE COMPANY MANAGMENT SYSTEM");

        mainPanel.setBackground(new java.awt.Color(235, 235, 235));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selectLoginOrRegisterLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectLoginOrRegisterLabel.setText("Please select one of the following");

        buttonPanel.setBackground(new java.awt.Color(245, 245, 245));
        buttonPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonPanel.setForeground(new java.awt.Color(204, 204, 255));

        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/add_person_16x16.png"))); // NOI18N
        registerButton.setText("REGISTER");
        registerButton.setToolTipText("Register to the system!");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/person_16x16.png"))); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.setToolTipText("Login to the system!");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(selectLoginOrRegisterLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(selectLoginOrRegisterLabel)
                .addGap(94, 94, 94)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
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

        navigateMenuLoginScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/person_16x16.png"))); // NOI18N
        navigateMenuLoginScreen.setText("Login Screen");
        navigateMenuLoginScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateMenuLoginScreenActionPerformed(evt);
            }
        });
        navigateMenu.add(navigateMenuLoginScreen);

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
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(30, 30, 30)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        this.dispose();
        new LoginScreen().setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        this.dispose();
        new RegisterScreen().setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void exitFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitFileMenuActionPerformed

    private void navigateMenuLoginScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuLoginScreenActionPerformed
       
        this.dispose();
        
        new LoginScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuLoginScreenActionPerformed

    private void navigateMenuRegisterScreenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateMenuRegisterScreenItemActionPerformed
        this.dispose();
        new RegisterScreen().setVisible(true);
    }//GEN-LAST:event_navigateMenuRegisterScreenItemActionPerformed
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JMenuItem exitFileMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu navigateMenu;
    private javax.swing.JMenuItem navigateMenuLoginScreen;
    private javax.swing.JMenuItem navigateMenuRegisterScreenItem;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel selectLoginOrRegisterLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
