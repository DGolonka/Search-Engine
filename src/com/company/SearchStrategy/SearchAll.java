package com.company.SearchStrategy;

import com.company.StringToHashMap;

import java.util.*;


public class SearchAll implements SearchMethod {
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
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.addAll(stringSet);
        boolean add = false;
        for (String v : list) {
            for (String p : pat) {
                if (!v.contains(v)) {
                    add = false;
                    break;
                } else {
                    add = true;
                }
                if (add) {
                    list2.add(v);
                }
            }

        }
        if (list2.isEmpty()) {
            System.out.println();
        } else {
            System.out.println(list2.size() + " persons found:");
            list2.forEach(System.out::println);
        }
    }
}
