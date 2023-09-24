// MinMaxAccount for BankingAccount class
public class MinMaxAccount extends BankAccount {

	int minBalance;
	int maxBalance;

	public int getMinBalance() {
		return minBalance;
	}

	public int getMaxBalance() {
		return maxBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public void setMaxBalance(int maxBalance) {
		this.maxBalance = maxBalance;
	}

    // create constructor the MinMaxAccount which the Startup Class as argument
	public MinMaxAccount(Startup s) {
		super(s);
		minBalance = s.s_getBalance();
		maxBalance = s.s_getBalance();

	}

	public void credit(Credit c) {
		super.Credit(c);

		int temp = getBalance();
		if (temp < minBalance)
			minBalance = temp;

		if (temp > maxBalance)
			maxBalance = temp;

	}

	public void debit(Debit d) {
		super.debit(d);

		int temp = getBalance();

		if (temp < minBalance)
			minBalance = temp;

		if (temp > maxBalance)
			maxBalance = temp;
	}

	public static void main(String[] args) {

	}
}