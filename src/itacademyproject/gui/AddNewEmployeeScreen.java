package itacademyproject.gui;

import javax.swing.*;
import javax.swing.JFrame;
import itacademyproject.data.*;
import itacademyproject.slq.DatabaseManager;
import java.awt.Color;
import java.awt.Toolkit;

public class AddNewEmployeeScreen extends JFrame {

    private JobItem[] jobs;
    private Color addNewEmployeeScreenBackLabelNormalColor, addNewEmployeeScreenBackLabelHighlightColor;

    public AddNewEmployeeScreen() {
        initComponents();
        initialize();

    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); 
        
        if(DatabaseManager.jobs.getJobCount() == 0)
        {
            this.dispose();
            
            JOptionPane.showMessageDialog(null, "You need to first add some jobs before adding employees!");
            
            new AddNewJobScreen().setVisible(true);
        }
    }
    
    

    private void initialize() {
        jobs = DatabaseManager.jobs.getAllJobs();

        jobsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.jobs.getAllJobsFormatted()));
        countriesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.countries.getAllCountriesFormatted()));

        countriesComboBox.setSelectedItem("BOSNIA & HERZEGOVINA");
        
        addNewEmployeeScreenBackLabelNormalColor = addNewEmployeeScreenBackLabel.getForeground();
        addNewEmployeeScreenBackLabelHighlightColor = Color.black;
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/itacademyproject/pics/icon_64x64.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        selectJobLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        jobsComboBox = new javax.swing.JComboBox<>();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        selectCountryLabel = new javax.swing.JLabel();
        countriesComboBox = new javax.swing.JComboBox<>();
        adressLabel = new javax.swing.JLabel();
        adressTextField = new javax.swing.JTextField();
        addNewEmployeeScreenBackLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee Screen");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("Add new Employee");

        firstNameLabel.setText("First Name");
        firstNameLabel.setToolTipText("");

        lastNameLabel.setText("Last Name ");

        selectJobLabel.setText("Choose a Job ");

        emailLabel.setText("Email");

        phoneNumberLabel.setText("Phone Number");

        ageLabel.setText("Age");

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/save_16x16.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        selectCountryLabel.setText("Choose a country");

        adressLabel.setText("Adress");

        addNewEmployeeScreenBackLabel.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        addNewEmployeeScreenBackLabel.setForeground(new java.awt.Color(51, 51, 51));
        addNewEmployeeScreenBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/back_16x16.png"))); // NOI18N
        addNewEmployeeScreenBackLabel.setText("Back");
        addNewEmployeeScreenBackLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addNewEmployeeScreenBackLabelMouseMoved(evt);
            }
        });
        addNewEmployeeScreenBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewEmployeeScreenBackLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addNewEmployeeScreenBackLabelMouseExited(evt);
            }
        });

        fileMenu.setText("File");

        fileMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/exit_16x16.png"))); // NOI18N
        fileMenuExit.setText("Exit");
        fileMenuExit.setToolTipText("");
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
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addNewEmployeeScreenBackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addGap(185, 185, 185))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(selectJobLabel)
                            .addComponent(emailLabel)
                            .addComponent(phoneNumberLabel)
                            .addComponent(ageLabel)
                            .addComponent(selectCountryLabel)
                            .addComponent(adressLabel))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jobsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastNameTextField)
                            .addComponent(firstNameTextField)
                            .addComponent(emailTextField)
                            .addComponent(phoneNumberTextField)
                            .addComponent(ageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(countriesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adressTextField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(addNewEmployeeScreenBackLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectJobLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCountryLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressLabel)
                    .addComponent(adressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String email = emailTextField.getText();
        String phoneNumber = phoneNumberTextField.getText();
        String adress = adressTextField.getText();
        String countryName = countriesComboBox.getItemAt(countriesComboBox.getSelectedIndex());
        JobItem job = jobs[jobsComboBox.getSelectedIndex()];
        int age = 0;

        try {
            age = Integer.parseInt(ageTextField.getText());
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Please enter a valid number as age!");
            return;
        }

        if (firstName.isEmpty() || lastName.isEmpty() || phoneNumber.isEmpty()
                || ageTextField.getText().isEmpty() || adress.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all input fields!");
        } else {
            LocationItem locationItem = new LocationItem(countryName, adress);

            EmployeeItem employee = new EmployeeItem(firstName, lastName, email, phoneNumber, age, job, locationItem);

            if (DatabaseManager.employees.employeeExists(employee)) {
                JOptionPane.showMessageDialog(null, "That employee already exists");
            } else {
                if (!DatabaseManager.locations.locationExists(locationItem)) {
                    DatabaseManager.locations.addLocation(locationItem);
                }

                DatabaseManager.employees.addEmployee(employee);

                JOptionPane.showMessageDialog(null, "Successfully added a new employee!");
            }

        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void fileMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuExitActionPerformed
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_fileMenuExitActionPerformed

    private void addNewEmployeeScreenBackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewEmployeeScreenBackLabelMouseClicked
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_addNewEmployeeScreenBackLabelMouseClicked

    private void addNewEmployeeScreenBackLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewEmployeeScreenBackLabelMouseMoved
        addNewEmployeeScreenBackLabel.setForeground(addNewEmployeeScreenBackLabelHighlightColor);
    }//GEN-LAST:event_addNewEmployeeScreenBackLabelMouseMoved

    private void addNewEmployeeScreenBackLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewEmployeeScreenBackLabelMouseExited
        addNewEmployeeScreenBackLabel.setForeground(addNewEmployeeScreenBackLabelNormalColor);
    }//GEN-LAST:event_addNewEmployeeScreenBackLabelMouseExited

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
//            java.util.logging.Logger.getLogger(AddNewEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddNewEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddNewEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddNewEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddNewEmployeeScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addNewEmployeeScreenBackLabel;
    private javax.swing.JLabel adressLabel;
    private javax.swing.JTextField adressTextField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JComboBox<String> countriesComboBox;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuExit;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JComboBox<String> jobsComboBox;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel selectCountryLabel;
    private javax.swing.JLabel selectJobLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
