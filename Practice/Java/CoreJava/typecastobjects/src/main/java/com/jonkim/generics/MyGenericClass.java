package com.jonkim.generics;

public class MyGenericClass <T> { // The T key is a generic for type, that can be specified later
    private T myType; // T once again here to show the type is generic, which is reusable as different types

    public T getMyType() { // T again for reuse
        return myType;
    }

    public void setMyType(T myType) {
        this.myType = myType;
    }
}
