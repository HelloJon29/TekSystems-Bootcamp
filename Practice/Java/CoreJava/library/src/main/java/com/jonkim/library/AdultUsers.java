package com.jonkim.library;

public class AdultUsers implements LibraryUser{
    private int age;
    private String bookType;

    @Override
    public void registerAccount() {

        if (this.age > 12) {
            System.out.println("You have successfully registered under an Adult Account.");
        }
        else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {

        if (this.bookType == "Fiction") {
            System.out.println("Book issued successfully, please return the book within 7 days.");
        }
        else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }

    public void setAge(int age) { // Setter to set user age
        this.age = age;
    }

    public void setBookType(String bookType) { // Setter to set book type
        this.bookType = bookType;
    }
}
