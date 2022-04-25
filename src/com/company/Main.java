package com.company;

import com.company.MenuCommand.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean start = true;
        final Scanner scanner = new Scanner(System.in);
        String fileName = args[1];
        Controller controller = new Controller();
        Menu menu = new Menu();

        Command printAllPerson = new PrintAllPersonCommand(menu);
        Command printMenu = new PrintMenuCommand(menu);
        Command findPerson = new FindPersonCommand(menu);
        Command exit = new ExitCommand(menu);

        menu.setPersons(fileName);


        while (start) {
            controller.setCommand(printMenu);
            controller.executeCommand();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    controller.setCommand(findPerson);
                    controller.executeCommand();
                    break;
                case 2:
                    controller.setCommand(printAllPerson);
                    controller.executeCommand();
                    break;
                case 0:
                    controller.setCommand(exit);
                    controller.executeCommand();
                    start = false;
                    break;
                default:
                    System.out.println("Incorrect option! Try again.");
            }
        }
    }


}
