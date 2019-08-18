package com.itacademy.molchanova.week.second.task2.service;

import java.lang.reflect.Array;
import java.util.*;

public class AnagramService {

    public ArrayList<TreeSet<String>> checkArray(String[] arrayString) {
        List<String> list = new LinkedList<>(Arrays.asList(arrayString));
        ArrayList<TreeSet<String>> finalArray = new ArrayList<>();
        for (int i = 0; i < list.size(); i ++) {
            char[] a = list.get(i).toCharArray();
            Arrays.sort(a);
            TreeSet<String> newList = new TreeSet<>();
            newList.add(list.get(i));
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).length() == list.get(j).length()) {
                    char[] b  = list.get(j).toCharArray();
                    Arrays.sort(b);
                    if (Arrays.equals(a, b)) {
                        newList.add(list.get(j));
                        list.remove(j);
                        j--;
                    }
                }
            }
            finalArray.add(newList);
        }
        return finalArray;
    }
}
