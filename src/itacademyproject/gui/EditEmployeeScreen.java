package itacademyproject.gui;

import itacademyproject.data.EmployeeItem;
import itacademyproject.data.JobItem;
import itacademyproject.data.LocationItem;
import itacademyproject.slq.DatabaseManager;
import java.awt.Color;
import javax.swing.JOptionPane;

public class EditEmployeeScreen extends javax.swing.JFrame {

    private EmployeeItem[] employees;
    private JobItem[] jobs;
    private Color editEmployeeScreenBackLabelNormalColor, editEmployeeScreenBackLabelHighlightColor;
    private int selectedEmployeeToEditIndex = 0, selectedJobIndex = 0;

    public EditEmployeeScreen() {
        initComponents();
        initialize();
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);

        if (DatabaseManager.employees.getEmployeeCount() == 0) {
            this.dispose();

            JOptionPane.showMessageDialog(null, "Please add some employees before editing them!");

            new MainMenuScreen().setVisible(true);
        }

    }

    private void initialize() {

        if (DatabaseManager.employees.getEmployeeCount() > 0) {
            employees = DatabaseManager.employees.getAllEmployees();
            jobs = DatabaseManager.jobs.getAllJobs();

            employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.employees.getAllEmployeesFormatted()));
            jobsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.jobs.getAllJobsFormatted()));
            countriesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.countries.getAllCountriesFormatted()));

            employeeComboBox.setSelectedIndex(0);

            editEmployeeScreenBackLabelNormalColor = editEmployeeScreenBackLabel.getForeground();
            editEmployeeScreenBackLabelHighlightColor = Color.black;
        }

    }

    private void updateUI() {
        employees = DatabaseManager.employees.getAllEmployees();
        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManager.employees.getAllEmployeesFormatted()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        selectEmployeeLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        selectJobLabel = new javax.swing.JLabel();
        jobsComboBox = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();
        firstNameLabel = new javax.swing.JLabel();
        employeeComboBox = new javax.swing.JComboBox<>();
        firstNameTextField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        selectCountryLabel = new javax.swing.JLabel();
        countriesComboBox = new javax.swing.JComboBox<>();
        adressLabel = new javax.swing.JLabel();
        adressTextField = new javax.swing.JTextField();
        editEmployeeScreenBackLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Employee Screen");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("Edit Employee");

        selectEmployeeLabel.setText("Select Employee To Edit");
        selectEmployeeLabel.setToolTipText("");

        lastNameLabel.setText("Last Name ");

        emailLabel.setText("Email");

        phoneNumberLabel.setText("Phone Number");

        ageLabel.setText("Age");

        selectJobLabel.setText("Choose a new Job ");

        jobsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobsComboBoxActionPerformed(evt);
            }
        });

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/edit_16x16.png"))); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        firstNameLabel.setText("First Name");
        firstNameLabel.setToolTipText("");

        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeComboBoxActionPerformed(evt);
            }
        });

        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/clear_16x16.png"))); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        selectCountryLabel.setText("Choose a new country");

        adressLabel.setText("Adress");

        editEmployeeScreenBackLabel.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        editEmployeeScreenBackLabel.setForeground(new java.awt.Color(51, 51, 51));
        editEmployeeScreenBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itacademyproject/pics/back_16x16.png"))); // NOI18N
        editEmployeeScreenBackLabel.setText("Back");
        editEmployeeScreenBackLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                editEmployeeScreenBackLabelMouseMoved(evt);
            }
        });
        editEmployeeScreenBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editEmployeeScreenBackLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editEmployeeScreenBackLabelMousePressed(evt);
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
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectEmployeeLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(selectJobLabel)
                    .addComponent(emailLabel)
                    .addComponent(phoneNumberLabel)
                    .addComponent(ageLabel)
                    .addComponent(firstNameLabel)
                    .addComponent(selectCountryLabel)
                    .addComponent(adressLabel)
                    .addComponent(editEmployeeScreenBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jobsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastNameTextField)
                            .addComponent(emailTextField)
                            .addComponent(ageTextField)
                            .addComponent(employeeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(countriesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adressTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(titleLabel)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(editButton)
                .addGap(51, 51, 51)
                .addComponent(clearButton)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(editEmployeeScreenBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectEmployeeLabel)
                    .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressLabel)
                    .addComponent(adressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String email = emailTextField.getText();
        String phoneNumber = phoneNumberTextField.getText();
        String adress = adressTextField.getText();
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

            String selectedEmployeeFirstName = employees[employeeComboBox.getSelectedIndex()].getFirstName();
            String selectedEmployeeLastName = employees[employeeComboBox.getSelectedIndex()].getLastName();
            String selectedEmployeeJobName = getJobNameFromJobsComboBox(selectedJobIndex);
            String selectedCountryName = countriesComboBox.getItemAt(countriesComboBox.getSelectedIndex());
            
            int employeeIDToUpdate = DatabaseManager.employees.getIDFromName(selectedEmployeeFirstName, selectedEmployeeLastName);
            int newJobId = DatabaseManager.jobs.getIDFromName(selectedEmployeeJobName);
            LocationItem locationItem = new LocationItem(selectedCountryName, adress);
            int newLocationID = 0;

            if (!DatabaseManager.locations.locationExists(locationItem)) {
                DatabaseManager.locations.addLocation(locationItem);
                newLocationID = DatabaseManager.locations.getMaximumID();
            } else {
                newLocationID = DatabaseManager.locations.getIDFromLocation(locationItem);
            }

            EmployeeItem employee = new EmployeeItem(firstName, lastName, email, phoneNumber, age, null, null);

            DatabaseManager.employees.updateEmployee(employeeIDToUpdate, employee, newJobId, newLocationID);

            updateUI();

            JOptionPane.showMessageDialog(null, "Succeessfull edit!");
        }


    }//GEN-LAST:event_editButtonActionPerformed

    private void employeeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeComboBoxActionPerformed

        selectedEmployeeToEditIndex = employeeComboBox.getSelectedIndex();

        EmployeeItem selectedEmployee = employees[selectedEmployeeToEditIndex];

        firstNameTextField.setText(selectedEmployee.getFirstName());
        lastNameTextField.setText(selectedEmployee.getLastName());
        emailTextField.setText(selectedEmployee.getEmail());
        phoneNumberTextField.setText(selectedEmployee.getPhoneNumber());
        ageTextField.setText(Integer.toString(selectedEmployee.getAge()));
        adressTextField.setText(selectedEmployee.getLocationItem().getAdress());

        //Updates jobsComboBox with correct job of selected employee
        for (int i = 0; i < jobsComboBox.getItemCount(); i++) {
            String jobName = jobsComboBox.getItemAt(i);

            jobName = jobName.substring(0, jobName.indexOf(","));

            if (jobName.equals(selectedEmployee.getJob().getName())) {
                jobsComboBox.setSelectedIndex(i);

                break;
            }

        }

        //Updates countriesComboBox with correct country of selected employee
        for (int i = 0; i < countriesComboBox.getItemCount(); i++) {
            String countryName = countriesComboBox.getItemAt(i);

            if (countryName.equals(selectedEmployee.getLocationItem().getCountryName())) {
                countriesComboBox.setSelectedIndex(i);
                break;
            }

        }


    }//GEN-LAST:event_employeeComboBoxActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

        firstNameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        phoneNumberTextField.setText("");
        ageTextField.setText("");
        adressTextField.setText("");

    }//GEN-LAST:event_clearButtonActionPerformed

    private void jobsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobsComboBoxActionPerformed
        selectedJobIndex = jobsComboBox.getSelectedIndex();
    }//GEN-LAST:event_jobsComboBoxActionPerformed

    private void editEmployeeScreenBackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeScreenBackLabelMousePressed
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_editEmployeeScreenBackLabelMousePressed

    private void editEmployeeScreenBackLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeScreenBackLabelMouseMoved
        editEmployeeScreenBackLabel.setForeground(editEmployeeScreenBackLabelHighlightColor);
    }//GEN-LAST:event_editEmployeeScreenBackLabelMouseMoved

    private void editEmployeeScreenBackLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeScreenBackLabelMouseExited
        editEmployeeScreenBackLabel.setForeground(editEmployeeScreenBackLabelNormalColor);
    }//GEN-LAST:event_editEmployeeScreenBackLabelMouseExited

    private void fileMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuExitActionPerformed
        this.dispose();
        new MainMenuScreen().setVisible(true);
    }//GEN-LAST:event_fileMenuExitActionPerformed

    private String getJobNameFromJobsComboBox(int index) {
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

    private String getEmployeeNameFromEmployeeComboBox(int index) {
        for (int i = 0; i < employeeComboBox.getItemCount(); i++) {
            if (index == i) {
                String employeeName = employeeComboBox.getItemAt(i);

                employeeName = employeeName.substring(0, employeeName.indexOf(","));

                return employeeName;
            }

        }

        return "";
    }
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
//            java.util.logging.Logger.getLogger(EditEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditEmployeeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditEmployeeScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressLabel;
    private javax.swing.JTextField adressTextField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> countriesComboBox;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel editEmployeeScreenBackLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> employeeComboBox;
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
    private javax.swing.JLabel selectCountryLabel;
    private javax.swing.JLabel selectEmployeeLabel;
    private javax.swing.JLabel selectJobLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
