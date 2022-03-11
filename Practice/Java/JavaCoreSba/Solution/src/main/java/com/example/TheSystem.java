package com.example;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {

    // Declare private instance of HashMap Object
    private HashMap<String, Item> itemCollection;

    TheSystem() {
        // Initialize itemCollection as an empty HashMap
        this.itemCollection = new HashMap<>();
        // Initialize Scanner and set the path to the sample.txt

        // Check if this constructor is being invoked by the AppSystem Class
        if(getClass().getSimpleName().equals("AppSystem")) {
            try {
                // Instantiate Buffered Reader and pass in FileReader object with sample.txt to begin reading file
                BufferedReader sampleReader = new BufferedReader(new FileReader("sample.txt"));
                String line = "";

                // Use this while loop with String line to read to the end of the file and split by double space delimiter
                while ((line = sampleReader.readLine()) != null) {
                    String itemInfo[] = line.split("\\s{2,}");

                    itemCollection.put(itemInfo[0], new Item(
                            itemInfo[0],
                            itemInfo[1],
                            Double.valueOf(itemInfo[2]),
                            Integer.valueOf(itemInfo[3])));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException ie) {
                ie.printStackTrace();
            }

        }
    }
    
    public HashMap<String, Item> getItemCollection(){
        // Your code here
    }
    
    public Boolean checkAvailability(Item item) {
        // Your code here
    }
    
    public Boolean add(Item item) {
        // Your code here
    }

    public Item remove(String itemName) {
        // Your code here
    }

    public abstract void display();

    // Setter method for the instanced variable

    public void setItemCollection(HashMap<String, Item> itemCollection) {
        this.itemCollection = itemCollection;
    }
}


