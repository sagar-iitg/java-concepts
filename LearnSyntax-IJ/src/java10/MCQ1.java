package java10;

import java.util.ArrayList;

public class MCQ1 {

	
		public static void main(String[] args) {
			
			var list=new ArrayList<String>();
			list.add("Monday");
			list.add("Tuesday");
			//list.add(String::new);
			list.remove(0);
			System.out.println(list.get(0));
			
			
		}
	
}
