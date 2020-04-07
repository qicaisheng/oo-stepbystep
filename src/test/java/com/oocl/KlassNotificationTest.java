package com.oocl;

import org.junit.Assert;
import org.junit.Test;

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

        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.", teacher.getWelcomeMessage());
    }
}
