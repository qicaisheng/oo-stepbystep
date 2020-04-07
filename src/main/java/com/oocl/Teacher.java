package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person implements KlassObserver {

    private ArrayList<String> welcomeMessages = new ArrayList<String>();

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.", this.getName(), this.getAge());
    }

    @Override
    public void welcome(Student student, Klass klass) {
        String welcomeMessage = introduce() + String.format(" Welcome %s join Class %d.", student.getName(), klass.getNumber());
        welcomeMessages.add(welcomeMessage);
    }

    public List<String> getWelcomeMessages() {
        return welcomeMessages;
    }
}
