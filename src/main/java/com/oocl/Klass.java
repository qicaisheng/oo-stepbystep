package com.oocl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Klass implements KlassSubject {
    private int number;
    private List<Student> students;
    private Student leader;
    private Teacher teacher;
    private Set<KlassObserver> klassObservers = new HashSet<>();

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
        register(teacher);
    }

    public boolean isTeacherOfThisClass(Teacher teacher) {
        return this.teacher == teacher;
    }

    public void appendMember(final Student student) {
        if (student.getKlassNumber() != number) {
            klassObservers.forEach(klassObserver -> klassObserver.welcome(student, this));
            register(student);
            this.students.add(student);
        }
    }

    @Override
    public void register(KlassObserver klassObserver) {
        klassObservers.add(klassObserver);
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
