package com.company.MenuCommand;

import com.company.Menu;
import com.company.MenuCommand.Command;

public class FindPersonCommand implements Command {
    private Menu menu;

    public FindPersonCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.findPerson();
    }
}
