public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private int discountCount;
    private double totalDiscount;


    // Constructor
    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk); 
        this.preferred = preferred;
        this.discountCount = 0;
        this.totalDiscount = 0.0;
    }

    @Override
    public void add(Item i) {
        super.add(i); 

        if (preferred && i.getDiscount() > 0.0) {
            discountCount++;
            totalDiscount += i.getDiscount();
        }
    }
    public int getDiscountCount() {
        return discountCount;
    }

    // Get the total discount amount
    public double getDiscountAmount() {
        return totalDiscount;
    }

    // Get the percentage of the original bill that was discounted
    public double getDiscountPercent() {
        if (preferred && discountCount > 0) {
            double originalTotal = super.getTotal();
            double discountPercent = (totalDiscount / originalTotal) * 100.0;
            return discountPercent;
        } else {
            return 0.0;
        }
    }
}