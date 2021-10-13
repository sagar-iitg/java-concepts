package pkg;

public class LoopExample {


    public static void main(String[] args){
        for (int i=0; i<10; i=i++){

            System.out.println(i);
            i+=1;
            System.out.println(i);
            System.out.println("Hello World!");
        }
    }
}
