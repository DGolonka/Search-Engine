package com.company.MenuCommand;

import com.company.Menu;
import com.company.MenuCommand.Command;

public class PrintAllPersonCommand implements Command {

    private Menu menu;

    public PrintAllPersonCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.printAllPeople();
    }
}
