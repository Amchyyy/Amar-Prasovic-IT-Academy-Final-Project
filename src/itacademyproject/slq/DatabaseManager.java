package itacademyproject.slq;

public class DatabaseManager { 
                               
    
    public static final String CONNECTION_TO_DATABASE = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "amchy";
    
    
    public static RegisteredUsersDatabaseExecutor registeredUsers = new RegisteredUsersDatabaseExecutor();
    public static EmployeesDatabaseExecutor employees = new EmployeesDatabaseExecutor();
    public static JobsDatabaseExecutor jobs = new JobsDatabaseExecutor();
    public static CountriesDatabaseExecutor countries = new CountriesDatabaseExecutor();
    public static LocationsDatabaseExecutor locations = new LocationsDatabaseExecutor();
}
