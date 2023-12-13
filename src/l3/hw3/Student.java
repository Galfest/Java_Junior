package l3.hw3;

import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;
    transient private double GPA; // transient используется для исключения поля из сериализации

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + GPA);
    }
}

