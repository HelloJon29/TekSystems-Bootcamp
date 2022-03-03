package com.example.map_exercises;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>(100, 0.5f);
        hashMap.put("23", "sang");
        hashMap.put("12", "shin");
        hashMap.put("230", "katy");
        System.out.println(hashMap);

        String name = hashMap.get("12");
        System.out.println(name);
    }
}
