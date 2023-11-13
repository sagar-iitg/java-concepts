package exception;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		String str = method1();
		System.out.println("main ended");
	}

	private static String method1() {
		String str = method2();
		return str;
	}

	private static String method2() {
		String str = null;
		str.length();
		return str;
	}

}
