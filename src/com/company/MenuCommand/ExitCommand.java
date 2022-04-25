package com.company.MenuCommand;

import com.company.Menu;
import com.company.MenuCommand.Command;

public class ExitCommand implements Command {
    private Menu menu;

    public ExitCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.exit();
    }
}
