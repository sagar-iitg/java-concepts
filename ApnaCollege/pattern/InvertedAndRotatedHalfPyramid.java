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
        solve1(4,4);

        
    }

    private static void solve(int row,int col)
    {
        System.out.println();
        System.out.println("---------");

        System.out.println("using apache library");

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

    
    private static void solve1(int row,int col)
    {
        System.out.println();
        System.out.println("---------");

        System.out.println("Not using library");

        for(int i=1;i<=row;i++){

            //spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
