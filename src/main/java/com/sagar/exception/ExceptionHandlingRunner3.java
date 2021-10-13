package exception;

public class ExceptionHandlingRunner3 {

	public static void main(String[] args) {
		method1();
		System.out.println("main ended");
	}

	private static void method1() {
		method2();
		System.out.println("method 1 ended");

	}

	private static void method2() {

		try {
			int[] arr = { 1, 2, 3 };
			int x = arr[4];
			System.out.println("method2 ended");
		} catch (NullPointerException ex) {
			System.out.println("Null Pointer");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of index");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception");
			ex.printStackTrace();

		}
	}

}
