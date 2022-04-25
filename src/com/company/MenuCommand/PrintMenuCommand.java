package com.company.MenuCommand;

import com.company.Menu;
import com.company.MenuCommand.Command;

public class PrintMenuCommand implements Command {
    private Menu menu;

    public PrintMenuCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.printMenu();
    }
}
