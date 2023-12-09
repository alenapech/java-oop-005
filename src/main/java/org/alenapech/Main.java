package org.alenapech;

import org.alenapech.controller.Controller;
import org.alenapech.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("1", "2", "3");
        controller.createStudent("2", "3", "4");
        controller.createStudent("5", "6", "7");
        controller.createStudent("8", "9", "10");
        controller.printAllStudents();
        System.out.println();
        controller.createGroup(controller.createTeacher("11", "22", "33"), controller.getAllStudents());
        controller.printAllGroups();
    }
}