package com.coderx.passby;

public class PassByReferenceDemo {
    public static void main(String[] args) {
        Student student = new Student("Shenal Fernando", 22, "Negombo");
        System.out.println(student);
        changeName(student);
        System.out.println(student);

    }

    private static void changeName(Student p){
        p.setName("Coderx");
    }
}
