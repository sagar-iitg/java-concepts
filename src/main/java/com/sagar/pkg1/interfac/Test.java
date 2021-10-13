package pkg1.interfac;

interface Int1
{


    default void fun()
    {
        System.out.println("int1 fun method");

    }


}


interface Int2{


    default void fun(){
        System.out.println("int2 fun method");
    }
}


interface Int3 extends Int1, Int2
{

   // int a;
    default void fun(){
        System.out.println("int3 fun method");
    }
}


public class Test implements  Int1,Int2{

    public static void main(String[] args)
    {

//            Int1 t= new Test();
//            t.fun();



    }

    @Override
    public void fun() {
        Int1.super.fun();
    }
}
