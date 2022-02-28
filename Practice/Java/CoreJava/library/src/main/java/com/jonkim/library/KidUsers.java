package com.jonkim.library;

public class KidUsers implements LibraryUser{
    private int age;
    private String bookType;

    @Override
    public void registerAccount() {

        if (this.age < 12) {
            System.out.println("You have successfully registered under a Kids Account.");
        }
        else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook() {

        if (this.bookType.equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days.");
        }
        else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }

    public void setAge(int age) { // Setter to set user age
        this.age = age;
    }

    public void setBookType(String bookType) { // Setter to set book type
        this.bookType = bookType;
    }
}
