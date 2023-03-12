package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWritingRunner {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\Java\\files\\src\\files\\data.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		// String str
		ArrayList<String> str1 = new ArrayList<String>();
		while ((st = br.readLine()) != null) {
			// Print the string

			if (st.startsWith("*") || st.isEmpty()) {
				continue;
			}
			// System.out.println(st);
			// String arr[] = st.split(" ");
			List<String> arr = new ArrayList<>(Arrays.asList(st.split(" ")));
			// System.out.println(arr.get(0));
			// arr.(0);
			// arr.remove(arr.get(0));
			// System.out.println(arr.get(1));
			str1.add(arr.get(1));
			String joined2 = String.join(" ", arr.subList(2, arr.size()));

			// System.out.println(joined2);
			str1.add(joined2);
			// str1.add(st);

		}
		System.out.println(str1);
		// str1.removeAll(Arrays.asList("", null));

	}

}
