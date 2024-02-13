package com.sagar.pattern.matching;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Example {
    public static void main(String[] args) throws IOException {


        String currPath = System.getProperty("user.dir");
        String filePath = currPath + File.separator + "src" + File.separator +
                "main" + File.separator + "java" + File.separator +"com"+File.separator+"sagar"+File.separator+
                "pattern" + File.separator + "matching" + File.separator +
                "bundles.info";

        String[] lineToRemove={"org.eclipse.jetty.util_9.4.51.v20170502.jar",
                "org.eclipse.jetty.util_9.4.11.v20180605.jar",
                "org.eclipse.jetty.util_9.4.8.v20171121.jar"};

                for(String i:lineToRemove)
                    deleteLineContainingText(filePath, i);




    }
    private static void deleteLineContainingText(String filePath, String textToDelete) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + ".tmp"))) {

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                // Check if the current line contains the text to be removed
                if (currentLine.contains(textToDelete)) {
                    continue; // Skip this line (delete it)
                }

                // Write the line to the temporary file
                writer.write(currentLine);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Replace the original file with the temporary file
        try {
            Path originalPath = Path.of(filePath);
            Path tempPath = Path.of(filePath + ".tmp");

            Files.move(tempPath, originalPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

