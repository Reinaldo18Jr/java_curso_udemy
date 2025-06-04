package entities;

// FINAL -> não permite que a classe seja herdada
public final class SavingsAccount extends Account {
	
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// FINAL -> não permite que esse método seja sobreposto/editado em outra classe herdada (Overrride)
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
