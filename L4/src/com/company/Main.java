package com.company;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alireza");
        p.setFamily("Rambod");
        p.setAge(19);
        p.setJob("Student");
        p.setUsername("a-rambod");
        p.setPass("a.rambod1381");
        System.out.println("Name: "+p.getName());
        System.out.println("Family: "+p.getFamily());
        System.out.println("Age: "+p.getAge());
        System.out.println("Job: "+p.getJob());
        System.out.println("Username: "+p.getUsername());
        System.out.println("Password: "+p.getPass());
    }
}
