package org.alenapech.model;

public class Teacher extends User implements Comparable<Teacher> {

    private int teacherId;

    public Teacher(int teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if (o.getTeacherId() > teacherId)
            return -1;
        if (o.getTeacherId() < teacherId)
            return 1;
        return 0;
    }
}
