package itacademyproject.data;

import java.beans.PropertyDescriptor;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class MainExecutor {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args)
    {
      //POJO (Plain Old Java Object)
        
        
    }
    
    
    private class PojoClass // POJO, properties are public!
    {
        public String firstName;
        public String lastName;
        
        public String getName()
        {
            return firstName + " " + lastName;
        }
        
        
    }
            
            
}


