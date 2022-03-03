package com.jonkim.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
//        ArrayList<Integer> myList = new ArrayList<>(100);
//
//        for(int i = 0; i < 100; ++i) {
//            myList.add(i);
        List<Integer> iList1 = Arrays.asList(3,4,6,7,9,12,15,17,23); //shortcut for creating ArrayList
        List<Integer> iList2 = Arrays.asList(3,5,7,9,10,13,15,18,23);

        ArrayList<Integer> commonArray = new ArrayList<>(iList1); // Assign values of iList1 in a new ArrayList

        commonArray.retainAll(iList2); // use retainAll method from Collection to keep only the common elements of iList1 and 2 in commonArray

        System.out.println(commonArray);
    }

}
