package io_exercises;

import java.io.FileReader;

public class IoTest {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("testfile.txt");
            int i;
            while ((i = fr.read()) != -1)   /*	read() reading a single character.
return a character in ASCII form.  It returns -1 at the end of file. */ {
                System.out.print(i);
                System.out.print((char) i);
                fr.close();
            }
        } catch (Exception e) {
            System.out.println("Cannot read the file");
        }
    }
}
