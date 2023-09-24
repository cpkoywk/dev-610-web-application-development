public class Marketer extends Employee {

    // Constructor
    public Marketer() {
        // Call the superclass (Employee) constructor
        super();
    }

    // Overrides getSalary from Employee class
    @Override
    public double getSalary() {
        // Marketers make $50,000 ($10,000 more than general employees)
        return 50000.0;
    }

    // Additional method for Marketers
    public void advertise() {
        System.out.println("Act now, while supplies last!");
  

}
}