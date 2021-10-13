package concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {

		Map<Character, LongAdder> occurances = new Hashtable<>();
		String str = "ABCD ABCD ABCD";

		for (char i : str.toCharArray()) {
			LongAdder longAdder = occurances.get(i);
			if (longAdder == null) {
				longAdder = new LongAdder();

			}
			longAdder.increment();
			occurances.put(i, longAdder);
		}
		System.out.println(occurances);
	}

}
