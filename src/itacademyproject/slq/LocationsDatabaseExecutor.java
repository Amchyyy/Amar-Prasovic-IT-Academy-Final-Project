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

public class LocationsDatabaseExecutor {
    
    public void addLocation(LocationItem locationItem) //BOSNA , Azici 82
    {
        try {
            
            int country_id = DatabaseManager.countries.getIDFromName(locationItem.getCountryName());
            String adress = locationItem.getAdress();
                    
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            String query = "insert into locations (country_id,adress)"
                         + " values (?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1,country_id);
            preparedStatement.setString(2,adress);            
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
    
    public int getMaximumID()
    {
        try {
                    
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT id AS 'MAX_ID' FROM locations WHERE id = (SELECT MAX(id) FROM locations)";
            
            ResultSet rs = st.executeQuery(query);
            
            rs.next();
            
            int maxID = rs.getInt("MAX_ID");
            
            con.close();
            
            return maxID;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
            
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        
        return 0;
    }
    
    public boolean locationExists(LocationItem locationItem)
    {
        // BOSNIA & HERZEGOVINA
        // Sarajevo,Azici 82
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT * FROM locations";
        
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
            {
                String countryName = DatabaseManager.countries.getCountryFromID(rs.getInt("country_id"));
                String adress = rs.getString("adress");
              
                if(locationItem.getCountryName().equals(countryName) && locationItem.getAdress().equals(adress))
                {
                    con.close();
                    
                    return true;
                }
            }
            

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
    
    public int getIDFromLocation(LocationItem locationItem)
    {
        // BOSNIA & HERZEGOVINA
        // Sarajevo,Azici 82
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE,DatabaseManager.USER_NAME,DatabaseManager.PASSWORD);
            
            Statement st = con.createStatement();
            
            String query = "SELECT * FROM locations";
        
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
            {
                String countryName = DatabaseManager.countries.getCountryFromID(rs.getInt("country_id"));
                String adress = rs.getString("adress");
              
                if(locationItem.getCountryName().equals(countryName) && locationItem.getAdress().equals(adress))
                {
                    int id = rs.getInt("id");
                    
                    con.close();
                    
                    return id;
                }
            }
            

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
    
    public void deleteAllLocations()
    {
        int[] locationIDs = getLocationIDs(); 
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            for(int i = 0; i < locationIDs.length; i++)
            {
                String query = "DELETE FROM locations WHERE id = '"+locationIDs[i]+"'";
                
                 PreparedStatement preparedStatement = con.prepareStatement(query);
                 preparedStatement.execute();
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
    
    private int[] getLocationIDs()
    {
        int[] locationIDs = new int[getLocationCount()];  
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT id AS LOCATION_ID FROM locations";

            ResultSet rs = st.executeQuery(query);

            int index = 0;
            
            while(rs.next())
            {
                locationIDs[index++] = rs.getInt("LOCATION_ID");
            }

            con.close();

            return locationIDs;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return null;
    }
    
    private int getLocationCount()
    {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DatabaseManager.CONNECTION_TO_DATABASE, DatabaseManager.USER_NAME, DatabaseManager.PASSWORD);

            Statement st = con.createStatement();

            String query = "SELECT COUNT(id) AS LOCATION_COUNT FROM locations";

            ResultSet rs = st.executeQuery(query);

            rs.next();

            int locationCount = rs.getInt("LOCATION_COUNT");;

            con.close();

            return locationCount;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());

            JOptionPane.showMessageDialog(null, e2.getMessage());
        }

        return -1;
    }
    
    
    
}
