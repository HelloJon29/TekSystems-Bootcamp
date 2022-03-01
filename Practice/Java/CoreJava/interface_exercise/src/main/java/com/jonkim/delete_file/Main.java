package com.jonkim.delete_file;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File temp;
        try {
            temp = File.createTempFile("/Desktop/TestDelete/","deletethis.txt");
            System.out.println("Temp file created : " + temp.getAbsolutePath());
            System.out.println(File.separator);

            temp.deleteOnExit();
            System.out.println("temp file exists " + temp.exists());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
