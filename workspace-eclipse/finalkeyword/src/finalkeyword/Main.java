package finalkeyword;

public class Main {

	public static void main(String[] args) {
		final Customer c = new Customer();
		System.out.println(c.getName());
		c.setName("sagar");
		System.out.println(c.getName());
	}
}
