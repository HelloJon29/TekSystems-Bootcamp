package com.example.collection_exercises;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> myList = Arrays.asList(1,2,3,4);
//        Iterator itr =  myList.iterator();
//
//        int strElement = 0;
//        while  (itr.hasNext()) {
//            if(strElement == 2) {
//                itr.remove();
//                break;
//            }
//        }

        Set ts = new LinkedHashSet();

        ts.add(2);
        ts.add(1);
        ts.add(3);
        ts.add(3);

        System.out.println("Members of TreeSet in alph order: " + ts);

    }
}
