package exception;


public class Example {




    public static int divide(int a,int b)
    {
        return a/b;


    }
    public static void main(String[] args)  {


        try{
            divide(6,0);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }



    }
}
