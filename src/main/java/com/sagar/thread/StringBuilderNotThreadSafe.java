package com.sagar.thread;

public class StringBuilderNotThreadSafe {
    public static void main(String[] args) throws InterruptedException {

        StringBuilder sb1=new StringBuilder();
        //StringBuffer sb1=new StringBuffer();
        Thread th=new Thread(()->{
            for(int i=0;i<100;i++){
                sb1.append(i);
            }
        });

        Thread th2=new Thread(()->{
            for(int i=0;i<100;i++){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                sb1.append(i);

            }
        });



        th.start();
        th2.start();

        th.join();
        th2.join();
        System.out.println(sb1.length());

    }
}
