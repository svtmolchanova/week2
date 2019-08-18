package com.itacademy.molchanova.week.second.task3.service;

import java.util.*;

public class DominantElementService {

    public int getDominantElement(ArrayList<Integer> arrayList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arrayList) {
            Integer count = map.get(i);
            map.put(i, Objects.nonNull(count) ? (count + 1) : 1);
        }
        Integer dominantElement = Collections.max(map.entrySet(),
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }).getKey();
        return dominantElement;

    }

    public int getDominantElementON(ArrayList<Integer> arrayList) {
        Integer[] array = new Integer[arrayList.size()];
        arrayList.toArray(array);
        Arrays.sort(array);
        Integer current = array[0];
        Integer dominant = array[0];
        Integer count = 1;
        Integer maxCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == current) {
                count++;
            } else {
                if (count > maxCount) {
                    dominant = array[i - 1];
                    maxCount = count;
                }
                current = array[i];
                count = 1;
            }
        }
        dominant = count > maxCount ? array[array.length-1] : dominant;
        return dominant;
    }
}
