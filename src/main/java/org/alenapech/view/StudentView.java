package org.alenapech.view;

import org.alenapech.model.Student;

public class StudentView implements ConsoleView<Student> {
    @Override
    public void printOnConsole(Student student) {
        System.out.println(student.toString());
    }
}
