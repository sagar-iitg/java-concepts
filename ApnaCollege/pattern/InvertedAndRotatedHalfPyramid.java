package pattern;

import org.apache.commons.lang3.StringUtils;

// Half Pyramid

/*
 

      *
    * *
  * * *
* * * *



 */
   
public class InvertedAndRotatedHalfPyramid {

    public static void main(String[] args)
    {

        solve(4,4);

        
    }

    private static void solve(int row,int col)
    {

        //outter loop

        for(int i=1;i<=row;i++)
        {

            //inner
           
                int spaces=col-i;
                int stars=i;
               // System.out.println("hello");
                System.out.print(StringUtils.repeat(' ', spaces)+" "+ StringUtils.repeat('*', stars));


            
            System.out.println();
        }


    } 

}
