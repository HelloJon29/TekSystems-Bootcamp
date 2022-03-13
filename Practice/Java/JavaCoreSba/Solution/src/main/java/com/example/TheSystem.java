package com.example;

import java.io.*;
import java.util.HashMap;

public abstract class TheSystem {
    // Declare private instance of HashMap Object
    private HashMap<String, Item> itemCollection;

    TheSystem() {
        // Initialize itemCollection as an empty HashMap
        this.itemCollection = new HashMap<>();

        // Check if this constructor is being invoked by the AppSystem Class
        if(getClass().getSimpleName().equals("AppSystem")) {
            try {
                // Instantiate Buffered Reader and pass in FileReader object with sample.txt to begin reading file
                BufferedReader sampleReader = new BufferedReader(new FileReader("./resources/sample.txt"));
                String line = "";

                // Use this while loop with String line to read to the end of the file and split by double space delimiter
                while ((line = sampleReader.readLine()) != null) {
                    String itemInfo[] = line.split("\\s{2}");

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
    // Getter for the itemCollection map
    public HashMap<String, Item> getItemCollection(){
        return itemCollection;
    }

    // method that checks if an Item object exists
    public Boolean checkAvailability(Item item) {
        if (item.getQuantity() >= item.getAvailableQuantity()) {
            System.out.println("System is unable to add " + item.getItemName() +
                    " to the card. System only has " + item.getAvailableQuantity() +
                    " " + item.getItemName() + "s.");
            return false;
        } else {
        return true;
        }
    }

    // adds an item to the collection if it does not exist, if it does exist it will increment item quantity by 1
    public Boolean add(Item item) {
            if (item == null) {
                return false;
            } else if (itemCollection.containsKey(item.getItemName()) && checkAvailability(item)) {
                item.setQuantity(item.getQuantity() + 1);
                return true;
            } else if (!itemCollection.containsKey(item.getItemName())) {
                itemCollection.put(item.getItemName(), item);
                return true;
            } else {
            return false;
            }
    }

    // removes item from collection if it exists and returns the item that was removed
    public Item remove(String itemName) {
        if (itemCollection.containsKey(itemName)) {
            return itemCollection.remove(itemName);
        }
        return null;
    }

    public abstract void display();
}
