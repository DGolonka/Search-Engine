package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static List<String> readFile(String fileName) {
        File file = new File("src/com/company/name.txt");
        List<String> peoples = new ArrayList<>();
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                peoples.add(scanner.nextLine());
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        }
        return peoples;
    }
}
