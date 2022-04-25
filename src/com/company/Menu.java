package com.company;

import com.company.SearchStrategy.SearchAll;
import com.company.SearchStrategy.SearchAny;
import com.company.SearchStrategy.SearchMethod;
import com.company.SearchStrategy.SearchNone;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<String> persons;
    private final Scanner scanner = new Scanner(System.in);

    public void printMenu() {
        System.out.println("=== Menu ===\n" +
                "1. Find a person\n" +
                "2. Print all people\n" +
                "0. Exit");
    }

    public void setPersons(String fileName) {
        persons = ReadFile.readFile(fileName);
    }

    public void findPerson() {
        System.out.println("Select a matching strategy: ALL, ANY, NONE");
        String type = scanner.nextLine();
        System.out.println();
        SearchSender searchSender = new SearchSender();
        SearchMethod searchNone = new SearchNone();
        SearchMethod searchAll = new SearchAll();
        SearchMethod searchAny = new SearchAny();
        System.out.println("Enter a name or email to search all " +
                "suitable people.");
        String pattern = scanner.nextLine();
        System.out.println();
        switch (type) {
            case "ANY":
                searchSender.setMethod(searchAny);
                searchSender.search(persons, pattern);
                break;
            case "ALL":
                searchSender.setMethod(searchAll);
                searchSender.search(persons, pattern);
                break;
            case "NONE":
                searchSender.setMethod(searchNone);
                searchSender.search(persons, pattern);
                break;
        }
    }

    public void printAllPeople() {
        System.out.println();
        System.out.println("=== List of people ===");
        persons.forEach(System.out::println);
        System.out.println();
    }

    public void exit() {
        System.out.println();
        System.out.println("Bye!");
    }

}
