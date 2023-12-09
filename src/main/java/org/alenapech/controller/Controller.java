package org.alenapech.controller;

import org.alenapech.model.*;
import org.alenapech.service.DataService;
import org.alenapech.service.GroupService;
import org.alenapech.view.GroupView;
import org.alenapech.view.StudentView;
import org.alenapech.view.ConsoleView;

import java.util.List;

public class Controller {

    private final DataService service = new DataService();
    private final ConsoleView studentView = new StudentView();
    private final GroupService groupService = new GroupService();
    private final ConsoleView groupView = new GroupView();

    public Student createStudent(String firstName, String secondName, String lastName) {
        return (Student) service.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public Teacher createTeacher(String firstName, String secondName, String lastName) {
        return (Teacher) service.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void printAllStudents() {
        for (User user : service.getAllStudents()) {
            studentView.printOnConsole(user);
        }
    }

    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    public void createGroup(Teacher teacher, List<Student> studentList) {
        groupService.create(teacher, studentList);
    }

    public void printAllGroups() {
        for (Group group : groupService.getGroupList()) {
            groupView.printOnConsole(group);
        }
    }

}
