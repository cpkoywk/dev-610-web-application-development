public class Ticket {
    private int number;
    
    public Ticket(int number) {
        this.number = number;
    }
    
    public double getPrice() {
        return 0.0; 
    }

    public int getNumber() {
        return number; 
    }
    
    @Override
    public String toString() {
        return "Number: " + number + ", Price: " + getPrice();
    }
}

 class WalkupTicket extends Ticket {
    public WalkupTicket(int number) {
        super(number);
    }
    
    @Override
    public double getPrice() {
        return 50.0;
    }
}

 class AdvanceTicket extends Ticket {
    private int daysInAdvance;
    public AdvanceTicket(int number, int daysInAdvance) {
        super(number);
        this.daysInAdvance = daysInAdvance;
    }
    
    @Override
    public double getPrice() {
        if (daysInAdvance >= 10) {
            return 30.0;
        } else {
            return 40.0;
        }
    }
}

 class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int number, int daysInAdvance) {
        super(number, daysInAdvance);
    }
    
    @Override
    public double getPrice() {
        return super.getPrice() / 2;
    }
    @Override
    public String toString() {
        return "Number: " +  getNumber() + ", Price: " + getPrice() + " (ID required)";
    }
}