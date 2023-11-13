package thread;

public class Example3 {


    int counter=1;
    static int n;
    public void printOddNumber(){
        synchronized (this)
        {
            while(counter<n)
            {
                while (counter%2==0)
                {
                    try {
                        wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter+" ");
                counter++;
                notify();

            }
        }
    }


    public void printEvenNumber(){

        synchronized (this)
        {
            while (counter<n)
            {
                while (counter%2==1)
                {
                    try {
                        wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                }
                System.out.print(counter+" ");
                counter++;
                notify();
            }
        }
    }
    public static void main(String[] args) {

        n=5000;
        Example3 example3=new Example3();
        Thread t1=new Thread(()->example3.printEvenNumber());
        Thread t2=new Thread(()->example3.printOddNumber());
        t2.start();
        t1.start();


    }
}
