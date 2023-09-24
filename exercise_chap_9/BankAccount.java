// Each BankAccount object represents one user's
// account information including name and balance of money.
public class BankAccount {
    String name;
    double balance;
    double transactionFee; // New field for transaction fee
    int startup;

    public BankAccount() {
        this.name = "";
        this.balance = 0;
        this.transactionFee = 5;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        double totalAmountToWithdraw = amount + transactionFee;
        if (totalAmountToWithdraw <= balance) {
            balance = balance-totalAmountToWithdraw;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

        public void transfer(BankAccount second, double amount) {
        double totalAmountToTransfer = amount + transactionFee;
        if (totalAmountToTransfer <= balance) {
            balance -= totalAmountToTransfer;
            second.balance += amount;
        } else {
            double transferableBalance = balance - transactionFee;
            balance = balance-transferableBalance-transactionFee;
            second.balance += transferableBalance;
            System.out.println("Insufficient funds to transfer the full amount. Transferred: $" + transferableBalance);
        }
    }
    public String toString() {
        return name + ", $" + balance; }

public static void main(String[] args) {

        System.out.println("e8q11:");
        BankAccount ba =new BankAccount();
        ba.deposit(200);
        ba.name="Lebron";
        System.out.println(ba.name + " " +ba.balance+" "+ba.transactionFee);
        ba.withdraw(20);
        System.out.println(ba.name + " " +ba.balance+" "+ba.transactionFee);
        System.out.println("e8q12:");
        System.out.println(ba.toString());
        System.out.println("e8q13:");
        BankAccount ben = new BankAccount();
        BankAccount hal = new BankAccount();
        ben.name="ben";
        hal.name="hal";
        ben.transactionFee=5.0;
        hal.transactionFee=5.0;
        ben.deposit(80.00);
        hal.deposit(20.00);
        ben.transfer(hal, 20.00); 

        System.out.println(ben.toString()+" "+hal.toString());

        ben.transfer(hal, 10.00); 
        System.out.println(ben.toString()+" "+hal.toString());

        hal.transfer(ben, 60.00); 
        System.out.println(ben.toString()+" "+hal.toString());




    }
}
 