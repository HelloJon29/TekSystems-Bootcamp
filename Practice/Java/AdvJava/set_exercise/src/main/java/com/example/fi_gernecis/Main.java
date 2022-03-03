package com.example.fi_gernecis;

public class Main {
    public static void main(String[] args) {
        GenericInterface<Integer> nums = new GenericInterface<Integer>() {
            @Override
            public Integer compare(Integer o1, Integer o2) {

                if(o1 > o2) {
                    return o1;
                } else {
                    return o2;
                }
            }
        };
        int max = nums.compare(13, 9);
        System.out.println(max);

        GenericInterface<Integer> nums2 = (o1, o2) -> {if(o1 > o2) return o1; else return o2;};
        int max2 = nums2.compare(12,25);
        System.out.println(max2);
    }
}
