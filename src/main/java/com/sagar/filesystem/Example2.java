package com.sagar.filesystem;

import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws IOException {
        String currPath=Example2.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        System.out.println(currPath);
        String currentDirectory = System.getProperty("user.dir");
        System.out.println(currentDirectory);
        String pkgName=Example.class.getPackageName();
        System.out.println(pkgName);

    }
}
