package exception;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {

		// java 7
		try (Scanner scanner = new Scanner(System.in)) {

			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[20];
			System.out.println(number);

		}

	}

}
