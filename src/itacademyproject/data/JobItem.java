package itacademyproject.data;

public class JobItem {

    private double salary;
    private String name;

    public JobItem() {

    }

    public JobItem(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
