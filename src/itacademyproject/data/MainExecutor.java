package itacademyproject.data;

import itacademyproject.slq.DatabaseManager;
import java.lang.ClassNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class MainExecutor {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println(DatabaseManager.jobs.isPossibleToDeleteAJob(0));
    }
            
}


