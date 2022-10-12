package domain;

public class Accounts {

	
	protected int id;
	private String number;
	private Double total;
	
	public void deposit(Double value) {
		this.total += value;
	}
	
	public Boolean withdraw(Double value) {
		if (this.total >= value) {
			this.total =+ value;
			return true;
		} else {
			return false;
		}
		
	}
}
