public class Janitor extends Employee {

    // Constructor
    public Janitor() {
        // Call the superclass (Employee) constructor
        super();
    }

    // Overrides getSalary from Employee class
    @Override
    public double getSalary() {
        return 30000.0;
    }
    @Override
    public int getHours() {
        return 80;
    }

    public void clean() {
        System.out.println("Workin' for the man.");
    }

}