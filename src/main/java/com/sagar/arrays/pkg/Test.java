package com.sagar.arrays.pkg;

import java.time.LocalDateTime;
import java.util.*;

public class Test {

    public static void main(String[] args) throws Exception {
//
//        Test t=new Test();
//        t.check();
//        LocalDateTime currentDateTime = LocalDateTime.now();
//        System.out.println(currentDateTime);
//        Set s=new HashSet();
//        s.add(null);
//        s.add(5);
//        Iterator iter=s.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }

        BitSet bs1=new BitSet();
        BitSet bs2=new BitSet();
        bs1.set(7);
        bs1.set(1);
        bs1.set(2);
        bs1.set(4);
        bs1.set(3);
        bs1.set(6);

        bs2.set(4);
        bs2.set(6);
        bs2.set(3);
        bs2.set(9);
        bs2.set(2);
        bs1.andNot(bs2);
        bs1.and(bs2);
        bs1.andNot(bs2);
        System.out.println(bs1);
        bs1.and(bs2);
        System.out.println(bs2);

    }

//    private void check()  throws  Exception{
//        System.out.println("jj");
//    }
}
