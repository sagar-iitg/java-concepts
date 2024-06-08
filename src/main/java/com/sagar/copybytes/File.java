package com.sagar.copybytes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;



public class File {

    public static void main(String[] args) {





        try(FileInputStream fis=new FileInputStream("src/image.png")){
            //Read bytes from file
            BufferedInputStream bis = new BufferedInputStream(fis);
            int _byte;
            while ((_byte= bis.read())!=-1){
                System.out.println(_byte+" ");
            }


        }catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
