package com.sagar.filesystem;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentWorkingDirectoryExample {
    public static void main(String[] args) {
        // Get the current working directory
        Path currentWorkingDirectory = Paths.get("");

        System.out.println("Current Working Directory: " + currentWorkingDirectory.toAbsolutePath());

    }
}
