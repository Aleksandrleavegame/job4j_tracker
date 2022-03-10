package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Revin Aleksandr");
        student.setGroup("Intern");
        student.setAdmission(new Date());

        System.out.println(student.getName() + " started learning in the "
                + student.getGroup() + " group from " + student.getAdmission());
    }
}
