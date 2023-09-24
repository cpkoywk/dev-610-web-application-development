public class FilteredAccount extends Account {
    private int totalTransactions;
    private int filteredTransactions;

    // Constructor
    public FilteredAccount(Client c) {
        super(c); // Call the superclass constructor
        totalTransactions = 0;
        filteredTransactions = 0;
    }

    @Override
    public boolean process(Transaction t) {
        totalTransactions++; // Increment total transaction count

        if (t.value() == 0) {
            // Zero-valued transaction is approved but not processed
            return true;
        }

        // Process non-zero-valued transactions using the superclass method
        boolean approved = super.process(t);

        if (!approved) {
            filteredTransactions++; // Increment filtered transaction count
        }

        return approved;
    }

    public double percentFiltered() {
        if (totalTransactions == 0) {
            return 0.0; 
        } else {
            double percent = (double) (filteredTransactions * 100) / totalTransactions;
            return percent;
        }
    }
}