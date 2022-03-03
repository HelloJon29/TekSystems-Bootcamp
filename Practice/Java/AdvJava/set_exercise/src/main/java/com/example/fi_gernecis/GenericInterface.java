package com.example.fi_gernecis;

@FunctionalInterface
public interface GenericInterface <T> {
    T compare(T o1, T o2);
}
