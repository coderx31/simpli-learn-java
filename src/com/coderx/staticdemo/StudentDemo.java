package com.coderx.staticdemo;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Shenal Fernando",22,"Negombo");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
        System.out.println(Student.getCollege());
    }
}
