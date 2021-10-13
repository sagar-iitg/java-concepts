package com.sagar.filesystem;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentJavaFilePathExample {
    public static void main(String[] args) {
        // Get the current class
        Class<?> currentClass = CurrentJavaFilePathExample.class;


        // Get the package and class name
        String packageName = currentClass.getPackage().getName();
        String className = currentClass.getSimpleName();

        // Derive the package path and Java file path
        String packagePath = packageName.replace(".", "/");
        String javaFileName = className + ".java";

        // Get the current working directory
        Path currentWorkingDirectory = Paths.get("");

        // Concatenate paths to get the current Java file path
        Path currentJavaFilePath = currentWorkingDirectory.resolve("src/main/java").resolve(packagePath).resolve(javaFileName);

        System.out.println("Current Java File Path: " + currentJavaFilePath.toAbsolutePath());
    }
}
