package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements KlassObserver {

    private int klassNumber;
    private ArrayList<String> welcomeMessages = new ArrayList<String>();

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student of class %s. Coding for the glory of OOCL.", this.getName(), this.getAge(), this.klassNumber);
    }

    public int getKlassNumber() {
        return klassNumber;
    }

    public void setKlassNumber(int klass) {
        this.klassNumber = klass;
    }

    public List<String> getWelcomeMessages() {
        return this.welcomeMessages;
    }

    @Override
    public void welcome(Student student, Klass klass) {
        String welcomeMessage = introduce() + String.format(" Welcome %s join Class %d.", student.getName(), klass.getNumber());
        this.welcomeMessages.add(welcomeMessage);
    }
}
