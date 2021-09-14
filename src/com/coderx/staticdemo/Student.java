package com.coderx.staticdemo;


/*Theory*/
/*static method cannot access non static variable - (instance variable)*/
/*non static method can access static variables*/

public class Student {
    private String name;
    private int age;
    private String address;
    private static String college = "St. Anne's College";
    private static int count = 0;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static void studentCount(){
        count++;
    }

    public static int getStudentCount(){
        return count;
    }
}
