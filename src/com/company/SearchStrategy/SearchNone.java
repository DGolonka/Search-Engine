package com.company.SearchStrategy;

import com.company.SearchStrategy.SearchMethod;
import com.company.StringToHashMap;

import java.util.*;

public class SearchNone implements SearchMethod {
    @Override
    public void search(List<String> arr, String pattern) {
        List<String> arr2 = new ArrayList<>();
        arr2.addAll(arr);
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
        arr2.removeAll(stringSet);
        if (arr2.isEmpty()) {
            System.out.println();
        } else {
            System.out.println(arr2.size() + " persons found:");
            arr2.forEach(System.out::println);
        }
        System.out.println();
    }
}
