package exception;

class CurrenciesDoNotMatchException extends Exception {

	public CurrenciesDoNotMatchException(String msg) {
		super(msg);

	}
}

class Amount1 {
	private String currency;
	private int Amount1;

	public Amount1(String currency, int Amount1) {
		super();
		this.currency = currency;
		this.Amount1 = Amount1;
	}

	public void add(Amount1 that) throws CurrenciesDoNotMatchException {

		if (!this.currency.equals(that.currency)) {
			throw new CurrenciesDoNotMatchException("Currencies don't match " + this.currency + " & " + that.currency);
			// throw new Exception("Currencies don't match " + this.currency + " & " +
			// that.currency);
		}
		this.Amount1 = this.Amount1 + that.Amount1;

	}

	@Override
	public String toString() {
		return Amount1 + " " + currency;

	}

}

public class ThrowingExceptionRunner2 {

	public static void main(String[] args) throws Exception {

		Amount1 am1 = new Amount1("USD", 10);
		Amount1 am2 = new Amount1("EUR", 20);
		am1.add(am2);
		System.out.println(am1);

	}

}
