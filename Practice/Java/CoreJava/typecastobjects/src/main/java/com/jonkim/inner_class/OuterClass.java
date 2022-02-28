package com.jonkim.inner_class;

public class OuterClass {

    private String myPrivateField = "Hello";

    // Create a class within another is a form of Encapsulation
    public class InnerClass {
        // Inner class can have whatever a regular class does, remember Scope
        public String myInnerMethod() {
            return myPrivateField;
        }
    }

    public static class StaticNestedClass {

        public static String myStaticNestedMethod() {
            return "message from nested static class";
        }
    }
}
