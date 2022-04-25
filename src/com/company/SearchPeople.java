package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SearchPeople {
    public static void searchPeople(ArrayList<String[]> arr, String pattern) {
        ArrayList<String[]> foundPeople = new ArrayList<>();
        for (String[] strings1 : arr) {
            boolean add = false;
            for (String val : strings1) {
                if (val.matches(pattern)) {
                    add = true;
                }
            }
            if (add) {
                foundPeople.add(strings1);
            }
        }

        if (foundPeople.isEmpty()) {
            System.out.println("No matching people found.");
        } else {
            System.out.println(foundPeople.size() + " persons found:");
            for (String[] peoples : foundPeople) {
                for (int i = 0; i < peoples.length; i++) {
                    if (i == peoples.length - 1) {
                        System.out.print(peoples[i]);
                    } else {
                        System.out.printf("%s ", peoples[i]);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
