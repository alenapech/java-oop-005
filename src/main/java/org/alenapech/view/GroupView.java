package org.alenapech.view;

import org.alenapech.model.Group;

public class GroupView implements ConsoleView<Group> {
    @Override
    public void printOnConsole(Group entity) {
        System.out.println(entity.toString());
    }
}
