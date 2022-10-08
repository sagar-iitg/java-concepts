public class Example {


    public static void main(String[] args)
    {

     Box<String> box=new Box<>("thois is amazing");
        System.out.println(box.getContainer());
        System.out.println(box.container.getClass());



    }
}
