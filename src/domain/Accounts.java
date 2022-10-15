package domain;

public class Accounts {

	protected int id;
	private Integer number;
	private Double total;
	
	public Accounts(Integer number, Double total) {
		if(number < 1) {
			throw new IllegalArgumentException();
		}
		this.number = number;
		this.total = total;
	}

	public void deposit(Double value) {
		this.total += value;
	}

	public void withdraw(Double value) {
		if (this.total < value) {
			throw new InsuficientBalanceException(
					"Balance is insuficient! Balance: $" + this.total + " Withdraw: " + value);
		}

		this.total = +value;
	}
	
	public Double getTotal() {
		return this.total;
	}
}
