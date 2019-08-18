package com.itacademy.molchanova.week.second.task2.service;

import org.junit.Test;

import java.util.*;
import static org.junit.Assert.assertArrayEquals;

public class AnagramServiceTest {

    private AnagramService anagramService = new AnagramService();

    @Test
    public void checkAnagramArray() {
        String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("eat");
        tree1.add("tea");
        tree1.add("ate");
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("tan");
        tree2.add("nat");
        TreeSet<String> tree3 = new TreeSet<>();
        tree3.add("bat");
        ArrayList<TreeSet<String>> arrayList = new ArrayList<>();
        arrayList.add(tree1);
        arrayList.add(tree2);
        arrayList.add(tree3);
        ArrayList<TreeSet<String>> result = anagramService.checkArray(anagrams);
        assertArrayEquals(result.toArray(), arrayList.toArray());

    }

}
