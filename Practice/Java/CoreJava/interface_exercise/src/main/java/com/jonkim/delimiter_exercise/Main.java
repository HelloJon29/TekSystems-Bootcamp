package com.jonkim.delimiter_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("/Desktop/TestFolder");
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<String[]>();
            while(input.hasNextLine()) {
                String line = input.nextLine();
                data.add(line.split(","));
            }
            for(String[] line : data) {
                System.out.println(line[0] + " | " + line[1] + " | " + line[2]);
            }
        } catch(FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
            fileNotFoundException.printStackTrace();
        }
    }
}
