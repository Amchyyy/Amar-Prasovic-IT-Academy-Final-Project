package itacademyproject.data;

public class EmployeeItem {
    
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int age;
    private JobItem job;
    private LocationItem locationItem;

    
    public EmployeeItem()
    {
        
    }
    
    public EmployeeItem(String firstName, String lastName, String email, String phoneNumber, int age, JobItem job,LocationItem locationItem) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.job = job;
        this.locationItem = locationItem;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public JobItem getJob() {
        return job;
    }

    public void setJob(JobItem job) {
        this.job = job;
    }
    
    public LocationItem getLocationItem() {
        return locationItem;
    }

    public void setLocationItem(LocationItem locationItem) {
        this.locationItem = locationItem;
    }
    
}
