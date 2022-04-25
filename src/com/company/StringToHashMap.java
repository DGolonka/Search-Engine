package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class StringToHashMap {
    public static HashMap<String, List<Integer>> stringToHashMap(List<String> strings) {
        HashMap<String, List<Integer>> hashMap = new HashMap<>();

        for (int i = 0; i < strings.size(); i++) {
            for (String val : strings.get(i).split("\\s")) {
                hashMap.put(val.toLowerCase(Locale.ROOT), new ArrayList<>());
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            String[] str = strings.get(i).split("\\s");
            for (String val : str) {
                hashMap.get(val.toLowerCase(Locale.ROOT)).add(i);
            }
        }

        return hashMap;
    }
}
