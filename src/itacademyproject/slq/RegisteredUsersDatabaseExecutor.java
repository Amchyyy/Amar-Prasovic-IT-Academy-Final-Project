package itacademyproject.slq;

import itacademyproject.data.UserItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegisteredUsersDatabaseExecutor {
    
    public int getUserCount()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT COUNT(id) AS USER_COUNT FROM registered_users";
        
            ResultSet rs = st.executeQuery(query);
            
            rs.next();
            
            int userCount = rs.getInt("USER_COUNT");;
            
            con.close();
            
            return userCount;

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
    public int getIdFromUserName(UserItem user)
    {
        String userName = user.getUserName();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT id AS 'user_id' FROM registered_users WHERE user_name = '"+userName+"' ";
           
            ResultSet rs = st.executeQuery(query);
            rs.next();
            
            int id = rs.getInt("user_id");
           
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
    public boolean userExists(UserItem user)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT * FROM registered_users";
        
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                String userName = rs.getString("user_name");
                
                if(user.getUserName().equals(userName))
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
    public void registerUser(UserItem user)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            String query = " insert into registered_users (user_name,password)"
                         + " values (?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            
            //preparedStatement.setInt(0, 0);
            preparedStatement.setString(1,user.getUserName());
            preparedStatement.setString(2,user.getPassword());
            
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
    
}
