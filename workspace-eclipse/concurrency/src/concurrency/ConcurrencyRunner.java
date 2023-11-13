package concurrency;

public class ConcurrencyRunner {

	public static void main(String[] args) {

		Counter count = new Counter();
		count.incrementI();
		System.out.println(count.getI());

	}

}
