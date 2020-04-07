package com.oocl;

public class Teacher extends Person {

    private String welcomeMessage;

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.", this.getName(), this.getAge());
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void welcome(Student student, Klass klass) {
        welcomeMessage = introduce() + String.format(" Welcome %s join Class %d.", student.getName(), klass.getNumber());
    }
}
