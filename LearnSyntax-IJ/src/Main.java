import java.util.ArrayList;



public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();


        //CRUD Operation in ArrayList


        //Create operation
        arr.add(2);
        arr.add(3);
        arr.add(7);

        //Read Operation
        System.out.println(arr.get(0));

        //Update
        System.out.println(arr.set(0,5));

        System.out.println(arr);
        //Delete
        System.out.println(arr.remove(0));
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.contains(2));
        System.out.println(Integer.MAX_VALUE);








    }
}
