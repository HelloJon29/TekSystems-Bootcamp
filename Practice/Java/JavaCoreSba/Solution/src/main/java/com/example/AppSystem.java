package com.example;

import java.util.Map;

public class AppSystem extends TheSystem {
    AppSystem() {
    }
    // method to display a table of System Inventory
    @Override
    public void display() {
        String tableHeader = String.format("AppSystem Inventory:\n%-20s %-20s %-10s %-10s",
                "Name",
                "Description",
                "Price",
                "Available Quantity");
        System.out.println(tableHeader);
        // this for loop iterates over each entry and displays the value of the elements
        for (Map.Entry<String, Item> element : super.getItemCollection().entrySet()) {
            Item value = element.getValue();
            String tableValues = String.format("%-20s %-20s %-10.2f %-10d",
                    value.getItemName(),
                    value.getItemDesc(),
                    value.getItemPrice(),
                    value.getAvailableQuantity());
            System.out.println(tableValues);
        }
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        if (item == null) {
            return false;
        } else if (super.getItemCollection().containsKey(item.getItemName())) {
            System.out.println(item.getItemName() + " is already in the App System");
            return false;
        } else if (!super.getItemCollection().containsKey(item.getItemName())) {
            getItemCollection().put(item.getItemName(), item);
        }
        return true;
    }

    // this method checks if an item is in the collection, if it is, reduce availableQuantity by 1
    public Item reduceAvailableQuantity(String item_name) {
        boolean doesContain = super.getItemCollection().containsKey(item_name);

        if(doesContain) {
            Item itemObject = super.getItemCollection().get(item_name);
            Integer quantity = itemObject.getAvailableQuantity();
            itemObject.setAvailableQuantity(quantity - 1);
            // When the availableQuantity is 0 remove the item
            if (itemObject.getAvailableQuantity() == 0) {
                return super.getItemCollection().remove(item_name);
            }
        }
        return null;
    }
}
