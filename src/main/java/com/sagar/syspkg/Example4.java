package syspkg;

import java.util.Map;

public class Example4 {


    public static void main(String[] args)
    {

        System.getenv();

        //System.out.println(System.getenv());

        for (Map.Entry<String,String> i:System.getenv().entrySet()) {
            System.out.println(i.getKey()+" "+ i.getValue());
            
        }


    }
}
