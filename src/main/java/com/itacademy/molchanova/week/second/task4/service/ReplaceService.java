package com.itacademy.molchanova.week.second.task4.service;

import java.lang.reflect.Array;
import java.util.*;

public class ReplaceService {

    public Integer[] sortArray(Integer[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
         for (int i = 0; i < array.length; i++) {
            if(array[i]%2 != 0) {
                list.add(array[i]);
                index.add(i);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < index.size(); i++) {
            array[index.get(i)] = list.get(i);
        }

        return array;
    }
}
