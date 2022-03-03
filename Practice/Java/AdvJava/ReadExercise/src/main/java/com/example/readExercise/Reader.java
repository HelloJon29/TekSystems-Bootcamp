package com.example.readExercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    // class fields
    File file = new File("C:/Users/jonki/Desktop/tek-java-course/text-samples/IHaveADream.txt");
    String fileContents = "";
    Scanner scan = new Scanner(file);

    // Default constructor
    public Reader() throws FileNotFoundException {
    }

    public void readFile() { // baseline to just read a file

        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }

    public String convertFileToString() { // turn the file into a string object
        while(scan.hasNextLine()) {
            fileContents = fileContents.concat(scan.nextLine() + "\n");
        }
        scan.close();

        return fileContents;
    }

    public String[] splitFile () { // split the file by word count
        String[] wordArray = fileContents.split("\\s+");

//        for (String word : wordArray) {
//            System.out.println(word);
//        }
        return wordArray;
    }

}
