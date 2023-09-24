// A Cash object represents an amount of money held by an investor.
public class Cash implements Asset {
private double amount; // amount of money held
// constructs a cash investment of the given amount
public Cash(double amount) {
this.amount = amount;
}
// returns this cash investment's market value, which
// is equal to the amount of cash
public double getMarketValue() {
return amount;
}

// since cash is a fixed asset, it never has any profit
public double getProfit() {
return 0.0;
}

// sets the amount of cash invested to the given value
public void setAmount(double amount) {
    this.amount = amount;
}

//e9q13 Add an equals method to the Cash class introduced in this chapter. Two cash objects are considered equal if they
// represent the same amount of money.
public boolean equals(Cash other) {
        return this.amount == other.amount;
    }


public static void main(String[] args) {

        System.out.println("e9q13:");

        Cash c1= new Cash(15);
        Cash c2= new Cash(20);
        Cash c3= new Cash(15);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

}
}