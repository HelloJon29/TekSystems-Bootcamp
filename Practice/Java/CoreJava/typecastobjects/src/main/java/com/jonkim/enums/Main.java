package com.jonkim.enums;

public class Main {

    public static final String SUNDAY = "Sunday";
    public static final String MONDAY = "Mondxy";
    public static final String TUESDAY = "Tuesday";

    public static void main(String[] args) {

        // example of not using enum
        String sunday = SUNDAY;
        String monday = MONDAY;
        String tuesday = TUESDAY;

        // example of using enum
        Days sunday1 = Days.Sunday;
        Days monday1 = Days.Monday;
        Days tuesday1 = Days.Tuesday;
    }
}
