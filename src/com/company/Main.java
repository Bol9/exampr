package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(4);
        set1.add(3);
        set2.add(1);
        set2.add(5);
        set2.add(2);
        set2.add(0);
        set1.add(2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(simetricDiff(set1,set2));








    }
    public static Set<Integer> simetricDiff(Set<Integer> set1 , Set<Integer> set2){
        Set<Integer> set3 = new HashSet<>();
        for (int element: set1) {
            if(set2.contains(element)){
                continue;
            }else {
                set3.add(element);
            }
        }
        for (int element: set2) {
            if(set1.contains(element)){
                continue;
            }else {
                set3.add(element);
            }
        }


        return set3;
    }

}
