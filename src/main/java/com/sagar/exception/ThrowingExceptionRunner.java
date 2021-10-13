package exception;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws Exception {

		if (!this.currency.equals(that.currency)) {
			throw new Exception("Currencies don't match " + this.currency + " & " + that.currency);
		}
		this.amount = this.amount + that.amount;

	}

	@Override
	public String toString() {
		return amount + " " + currency;

	}

}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws Exception {

		Amount am1 = new Amount("USD", 10);
		Amount am2 = new Amount("EUR", 20);
		am1.add(am2);
		System.out.println(am1);

	}

}
