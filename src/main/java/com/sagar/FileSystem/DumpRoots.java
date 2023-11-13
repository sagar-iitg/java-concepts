package FileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class DumpRoots {


    public static void main(String[] args) {
        File[] roots= File.listRoots();

        for(File f:roots)
        {
            System.out.println(f);
            System.out.println(f.getFreeSpace());
            System.out.println(f.getUsableSpace());
            System.out.println(f.getTotalSpace());
            System.out.println(f.getParent());

        }
    }
}
