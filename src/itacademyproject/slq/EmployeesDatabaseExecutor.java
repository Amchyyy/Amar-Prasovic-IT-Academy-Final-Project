package itacademyproject.slq;

import itacademyproject.data.EmployeeItem;
import itacademyproject.data.JobItem;
import itacademyproject.data.LocationItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EmployeesDatabaseExecutor {

    public void addEmployee(EmployeeItem employee) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            String query = " insert into employees (first_name,last_name,email,phone_number,age,job_id,location_id)"
                    + " values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);

            //preparedStatement.setInt(0, 0);
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getEmail());
            preparedStatement.setString(4, employee.getPhoneNumber());
            preparedStatement.setInt(5, employee.getAge());
            preparedStatement.setInt(6, DatabaseManager.jobs.getIdFromJob(employee.getJob()));
            preparedStatement.setInt(7, DatabaseManager.locations.getIDFromLocation(employee.getLocationItem()));

            preparedStatement.execute();

            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
    }

    public boolean employeeExists(EmployeeItem employee) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT * FROM employees";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");

                if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                    con.close();

                    return true;
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return false;
    }

    public int getEmployeeCount() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT COUNT(id) AS EMPLOYEE_COUNT FROM employees";

            ResultSet rs = st.executeQuery(query);

            rs.next();

            int employeeCount = rs.getInt("EMPLOYEE_COUNT");;

            con.close();

            return employeeCount;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return -1;
    }

    public String[] getAllEmployeesFormatted() {
        String[] employeeList = new String[getEmployeeCount()];

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT * FROM employees ORDER BY id ASC";

            ResultSet rs = st.executeQuery(query);

            int index = 0;

            while (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int age = rs.getInt("age");

                employeeList[index++] = firstName + " " + lastName + ", " + age;  //WARNING , Dot not modify this format,EditEmployee class
                //uese this style of formating to search some data!
            }

            con.close();

            return employeeList;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return null;

    }

    public EmployeeItem[] getAllEmployees() {
        EmployeeItem[] employees = new EmployeeItem[getEmployeeCount()];

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT * FROM employees ORDER BY id ASC";

            ResultSet rs = st.executeQuery(query);

            int index = 0;

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");
                int age = rs.getInt("age");
                JobItem job = getJobFromID(id);
                LocationItem locationItem = getLocationItemFromID(id);

                EmployeeItem employee = new EmployeeItem(firstName, lastName, email, phoneNumber, age, job, locationItem);

                employees[index++] = employee;
            }

            con.close();

            return employees;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return null;

    }

    public EmployeeItem getEmployeeFromID(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT * FROM employees WHERE id = '" + id + "' ";

            ResultSet rs = st.executeQuery(query);

            rs.next();

            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String email = rs.getString("email");
            String phoneNumber = rs.getString("phone_number");
            int age = rs.getInt("age");
            int jobID = rs.getInt("job_id");
            JobItem job = getJobFromID(id);
            LocationItem locationItem = getLocationItemFromID(id);
            EmployeeItem employee = new EmployeeItem(firstName, lastName, email, phoneNumber, age, job, locationItem);

            con.close();

            return employee;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return null;
    }

    public EmployeeItem getEmployeeFromName(String firstName, String lastName) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT * FROM employees WHERE first_name = '" + firstName + "' AND last_name = '" + lastName + "' ";

            ResultSet rs = st.executeQuery(query);
            rs.next();

            int id = rs.getInt("id");
            String newFirstName = rs.getString("first_name");
            String newLastName = rs.getString("last_name");
            String email = rs.getString("email");
            String phoneNumber = rs.getString("phone_number");
            int age = rs.getInt("age");
            JobItem job = getJobFromID(id);
            LocationItem locationItem = getLocationItemFromID(id);

            EmployeeItem employee = new EmployeeItem(firstName, lastName, email, phoneNumber, age, job, locationItem);

            con.close();

            return employee;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return null;

    }

    public int getIDFromName(String firstName, String lastName) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT id AS 'EMPLOYEE_ID' FROM employees WHERE first_name = '" + firstName + "' AND last_name = '" + lastName + "' ";

            ResultSet rs = st.executeQuery(query);
            rs.next();

            int id = rs.getInt("EMPLOYEE_ID");

            con.close();

            return id;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return -1;

    }

    public void updateEmployee(int employeeID, EmployeeItem employee, int job_id, int location_id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "UPDATE employees SET first_name = '" + employee.getFirstName() + "' , "
                    + "last_name = '" + employee.getLastName() + "' , email = '" + employee.getEmail() + "' , "
                    + "phone_number = '" + employee.getPhoneNumber() + "' , age = '" + employee.getAge() + "' , "
                    + "job_id = '" + job_id + "' , location_id = '" + location_id + "' WHERE id = '" + employeeID + "'";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();

            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

    }

    public void deleteEmployee(int employeeID) { //Deletes all locations from locations database when all employees are deleted!
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            String query = "DELETE FROM employees WHERE id = '"+employeeID+"'";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            
            if(getEmployeeCount() == 0) 
            {
                DatabaseManager.locations.deleteAllLocations();
            }

            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

    }
    
    private JobItem getJobFromID(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT * FROM jobs,employees WHERE employees.id = '" + id + "' && employees.job_id = jobs.id";

            ResultSet rs = st.executeQuery(query);

            rs.next();

            JobItem job = new JobItem(rs.getString("name"), rs.getDouble("salary"));

            con.close();

            return job;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return null;
    }

    private LocationItem getLocationItemFromID(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT * FROM locations,employees WHERE employees.id = '" + id + "' && employees.location_id = locations.id";

            ResultSet rs = st.executeQuery(query);

            rs.next();

            LocationItem locationItem = new LocationItem(DatabaseManager.countries.getCountryFromID(rs.getInt("country_id")), rs.getString("adress"));

            con.close();

            return locationItem;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return null;
    }
}
