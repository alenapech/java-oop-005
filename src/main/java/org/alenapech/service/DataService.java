package org.alenapech.service;

import org.alenapech.model.Student;
import org.alenapech.model.Teacher;
import org.alenapech.model.Type;
import org.alenapech.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private final List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<Student> getAllStudents() {
        List<Student> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                resultList.add((Student) user);
            }
        }
        return resultList;
    }

    private int getMaxId(Type type) {
        boolean isStudent = Type.STUDENT == type;
        int lastId = 0;
        for (User user : userList) {
            if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && isStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }

    public User create(String firstName
            , String secondName
            , String lastName
            , Type type) {
        int id = getMaxId(type);
        User result = null;
        if (type == Type.STUDENT) {
            result = new Student(id, firstName, secondName, lastName);
            userList.add(result);
        }
        if (type == Type.TEACHER) {
            result = new Teacher(id, firstName, secondName, lastName);
            userList.add(result);
        }
        return result;
    }
}
