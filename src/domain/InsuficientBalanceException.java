package domain;

public class InsuficientBalanceException extends RuntimeException {
	
	public InsuficientBalanceException(String msg) {
		super(msg);
	}

}
