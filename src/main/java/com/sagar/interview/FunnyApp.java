package interview;


class Funny{

    String s;

    Funny(Object o)
    {
        this.s=o.toString();
    }

    Funny(Integer i)
    {
        this.s=i+" ";
    }

    Funny(String sArg)
    {
        this.s=sArg;

    }

}

class FunnyApp {


    public static void main(String[] args)
    {


        //Funny f=new Funny(null);
        Funny f=new Funny(1);
        System.out.println(f);


    }

}
