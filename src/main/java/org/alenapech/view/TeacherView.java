package org.alenapech.view;

import org.alenapech.model.Teacher;

public class TeacherView implements ConsoleView<Teacher> {
    @Override
    public void printOnConsole(Teacher teacher) {
        System.out.println(teacher.toString());
    }
}
