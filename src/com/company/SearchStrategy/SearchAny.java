package com.company.SearchStrategy;

import com.company.SearchStrategy.SearchMethod;
import com.company.StringToHashMap;

import java.util.*;


public class SearchAny implements SearchMethod {
    @Override
    public void search(List<String> arr, String pattern) {
        HashMap<String, List<Integer>> hashMap = StringToHashMap.stringToHashMap(arr);
        Set<String> stringSet = new HashSet<>();
        String[] pat = pattern.split("\\s");
        for (String v : pat) {
            if (hashMap.containsKey(v.toLowerCase(Locale.ROOT))) {
                for (Integer i : hashMap.get(v.toLowerCase(Locale.ROOT))) {
                    stringSet.add(arr.get(i));
                }
            }
        }
        if (stringSet.isEmpty()) {
            System.out.println();
        } else {
            System.out.println(stringSet.size() + " persons found:");
            stringSet.forEach(System.out::println);
        }

    }
}
