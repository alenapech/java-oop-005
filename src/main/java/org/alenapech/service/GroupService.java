package org.alenapech.service;

import org.alenapech.model.Group;
import org.alenapech.model.Student;
import org.alenapech.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class GroupService {
    private List<Group> groupList;
    private int maxId;

    public GroupService() {
        groupList = new ArrayList<>();
        maxId = 0;
    }

    public Group create(Teacher teacher, List<Student> studentList) {
        Group result = new Group(maxId, teacher, studentList);
        groupList.add(result);
        maxId++;
        return result;
    }

    public List<Group> getGroupList() {
        return groupList;
    }
}
