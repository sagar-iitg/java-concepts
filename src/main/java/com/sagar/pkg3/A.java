//package com.sagar.pkg3;
//
//class A{
//    public void test() throws NullPointerException{    }
//}
//
//class B extends A{
//    public void test() throws Exception{
//
//    }
//



/*
	•	Problem: Overriding methods cannot throw broader checked exceptions than the superclass method.
	•	Fix: The overriding method should either throw the same unchecked exception or none at all.


 */