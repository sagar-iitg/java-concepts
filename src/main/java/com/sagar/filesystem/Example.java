package com.sagar.filesystem;

public class Example {
    public static void main(String[] args) {
        String pkgName=Example.class.getPackageName();
        System.out.println(pkgName);
        String fileName="test.txt";
        String filePath=pkgName.replace('.','/')+"/"+fileName;
        System.out.println(filePath);
    }
}
