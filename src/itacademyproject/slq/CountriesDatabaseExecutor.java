package itacademyproject.slq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CountriesDatabaseExecutor {
    
    public String[] getAllCountriesFormatted()
    {
        String[] countryList = new String[getCountryCount()];
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT * FROM countries ORDER BY id ASC";
        
            ResultSet rs = st.executeQuery(query);
            
            int index = 0;
            
            while(rs.next())
            {
                String countryName = rs.getString("name");
                
                countryList[index++] = countryName;
                                                                                  
            }
            
            con.close();
            
            return countryList;

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
    public int getCountryCount()
     {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT COUNT(id) AS COUNTRY_COUNT FROM countries";
        
            ResultSet rs = st.executeQuery(query);
            
            rs.next();
            
            int countryCount = rs.getInt("COUNTRY_COUNT");;
            
            con.close();
            
            return countryCount;

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
    public String getCountryFromID(int id)
    {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT name FROM countries WHERE id = '"+id+"' ";
        
            ResultSet rs = st.executeQuery(query);
            rs.next();
               
            String name = rs.getString("name");

            con.close();
            
            return name;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        
        return "";
        
        
    }
    public int getIDFromName(String name)
    {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT id AS 'COUNTRY_ID' FROM countries WHERE name = '"+name+"' ";
        
            ResultSet rs = st.executeQuery(query);
            rs.next();
               
            int id = rs.getInt("COUNTRY_ID");

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
}
