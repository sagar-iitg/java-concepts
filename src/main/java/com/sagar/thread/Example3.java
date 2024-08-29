package com.sagar.thread;

import java.util.ArrayList;
import java.util.List;

public class Example3 {


    int counter=1;
    int n;
    List<Integer> list;

    public Example3(int n) {
        this.n = n;
        list=new ArrayList<>();
    }

    public synchronized void printOddNumber(){

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
                list.add(counter);
                counter++;
                notify();

            }

    }


    public synchronized void printEvenNumber(){


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
                list.add(counter);
                counter++;
                notify();
            }

    }
    public static void main(String[] args) throws InterruptedException {

        Example3 example3=new Example3(10);
        Thread t1=new Thread(example3::printEvenNumber);
        Thread t2=new Thread(example3::printOddNumber);
        t2.start();
        t1.start();
        t1.join();
        t2.join();
        System.out.println(example3.list);


    }
}
