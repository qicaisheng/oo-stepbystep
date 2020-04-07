package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private List<Student> students;
    private Student leader;
    private Teacher teacher;

    public Klass(int number) {
        this.number = number;
        this.students = new ArrayList<Student>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean isTeacherOfThisClass(Teacher teacher) {
        return this.teacher == teacher;
    }

    public void appendMember(final Student student) {
        if (student.getKlassNumber() != number) {
            students.forEach(otherStudent -> otherStudent.welcome(student, this));
            teacher.welcome(student, this);
            this.students.add(student);
        }
    }

    public boolean contains(Student student) {
        return students.contains(student);
    }

    public void assignLeader(Student student) {
        if (student.getKlassNumber() == this.number) {
            this.leader = student;
        }
    }

    public boolean isLeader(Student student) {
        return leader == student;
    }
}
