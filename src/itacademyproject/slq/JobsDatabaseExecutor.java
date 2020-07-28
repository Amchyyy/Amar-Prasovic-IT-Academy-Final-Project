
package itacademyproject.slq;

import itacademyproject.data.UserItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import itacademyproject.data.*;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;

public class JobsDatabaseExecutor {
    
    public boolean jobExists(JobItem job)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT * FROM jobs";
        
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                String jobName = rs.getString("name");
                
                if(job.getName().equals(jobName))
                {
                    con.close();
                    
                    return true;
                }
                
            }
            
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        
        return false;
    }
    public void addJob(JobItem job)
    {
           
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            String query = " insert into jobs (name,salary)"
                         + " values (?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            
            //preparedStatement.setInt(0, 0);
            preparedStatement.setString(1,job.getName());
            preparedStatement.setDouble(2,job.getSalary());
            
            preparedStatement.execute();
            
            con.close();
   

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
    }
    public void updateJob(int id,JobItem job)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            String query = "UPDATE jobs SET name = '"+job.getName()+"' , salary = '"+job.getSalary()+"' WHERE id = '"+id+"'";
                
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            
            con.close();
   

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
    }
    public String[] getAllJobsFormatted()
    {
        String[] jobsList = new String[getJobCount()];
        
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT * FROM jobs ORDER BY id ASC";
        
            ResultSet rs = st.executeQuery(query);
            
            int index = 0;
            
            while(rs.next())
            {
                String jobName = rs.getString("name");
                double jobSalary = rs.getDouble("salary");
                
                jobsList[index++] = jobName + ", " + formatter.format(jobSalary); //WARNING , Dot not modify this format,EditEmployee class
                                                                                  //uese this style of formating to search some data!
            }
            
            con.close();
            
            return jobsList;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        
        return null;
        
    }
    public JobItem[] getAllJobs()
    {
        JobItem[] jobs = new JobItem[getJobCount()];
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT * FROM jobs ORDER BY id ASC";
        
            ResultSet rs = st.executeQuery(query);
            
            int index = 0;
            
            while(rs.next())
            {
                String jobName = rs.getString("name");
                double jobSalary = rs.getDouble("salary");
                
                JobItem job = new JobItem(jobName,jobSalary);
                
                jobs[index++] = job;
            }
            
            con.close();
            
            return jobs;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        
        return null;
        
    }
    public JobItem getJobFromEmployeeJobID(int employee_id)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT * FROM jobs,employees WHERE employee.id = '"+employee_id+"' AND employee.job_id = jobs.id";
        
            ResultSet rs = st.executeQuery(query);
            rs.next();
            
            String jobName = rs.getString("name");
            double jobSalary = rs.getDouble("salary");
                
            JobItem job = new JobItem(jobName,jobSalary);
            
            con.close();
            
            return job;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        
        return null;
        
    }
    public int getJobCount()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT COUNT(id) AS JOB_COUNT FROM jobs";
        
            ResultSet rs = st.executeQuery(query);
            
            rs.next();
            
            int jobCount = rs.getInt("JOB_COUNT");;
            
            con.close();
            
            return jobCount;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        
        return -1;
    }
    public int getIdFromJob(JobItem job)
    {
        String jobName = job.getName();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT id AS 'job_id' FROM jobs WHERE name = '"+jobName+"' ";
           
            ResultSet rs = st.executeQuery(query);
            rs.next();
            
            int id = rs.getInt("job_id");
           
            con.close();
            
            return id;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        
        return -1;
        
    }
    public int getIDFromName(String jobName)
    {
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT id AS 'JOB_ID' FROM jobs WHERE name = '"+jobName+"'";
        
            ResultSet rs = st.executeQuery(query);
            rs.next();
            
            int jobID = rs.getInt("JOB_ID");;
            
            con.close();
            
            return jobID;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        
        return -1;
    }
    public boolean isPossibleToDeleteAJob(int jobID)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT COUNT(job_id) AS 'JOB_ID_COUNT' FROM employees WHERE job_id = '"+jobID+"'";
        
            ResultSet rs = st.executeQuery(query);
            
            rs.next();
            
            int jobIDCount = rs.getInt("JOB_ID_COUNT");;
            
            con.close();
            
            if(jobIDCount == 0) return true;
            else return false;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        
        return false;
    }
    public void deleteJob(int jobID) { //Deletes all locations from locations database when all employees are deleted!
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            String query = "DELETE FROM jobs WHERE id = '"+jobID+"'";

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
}
