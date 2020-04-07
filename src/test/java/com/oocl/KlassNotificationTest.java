package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class KlassNotificationTest {

    @Test
    public void should_notify_teacher_when_student_join_class() {
        Klass klass = new Klass(2);
        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);
        klass.assignTeacher(teacher);
        
        Student student = new Student();
        student.setName("Tom");
        
        klass.appendMember(student);

        List<String> welcomeMessages = teacher.getWelcomeMessages();
        Assert.assertEquals(1, welcomeMessages.size());
        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.", welcomeMessages.get(0));
    }

    @Test
    public void should_notify_other_students_when_student_join_class() {
        Klass klass = new Klass(2);
        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);
        klass.assignTeacher(teacher);

        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(18);
        klass.appendMember(tom);
        tom.setKlassNumber(2);

        
        Student jim = new Student();
        jim.setName("Jim");
        klass.appendMember(jim);

        
        List<String> welcomeMessages = tom.getWelcomeMessages();
        Assert.assertEquals(1, welcomeMessages.size());
        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.", welcomeMessages.get(0));
    }
}
