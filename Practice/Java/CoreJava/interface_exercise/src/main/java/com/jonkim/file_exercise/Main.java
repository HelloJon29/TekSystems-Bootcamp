package com.jonkim.file_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            String location = "/Desktop/TestFileFolder/TestFile/";
            File file = new File(location);
            boolean fileCreatedOrNot = file.createNewFile();
            Scanner input = new Scanner(file); // Without handling the checked exception, this is a compiler error
            String line = input.nextLine();
        } catch(FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
