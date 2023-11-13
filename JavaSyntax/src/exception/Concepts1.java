package exception;

import java.io.IOException;

class Parent{
	
	Parent() throws IOException{
		System.out.println("Parent");
		
	}
}

class Child extends Parent{
	
	Child() throws Exception{
		System.out.println("Child");
		
	}
}
public class Concepts1 {
	
	public static void main(String[] args) throws Exception{
		Parent obj=new Child();
		
	}
	
	

}
