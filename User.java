package com.yechao.javabean;

public class User {
    private String name;
    private int age;
    private double salary;
    private String relationship;

    public User(){

    }

    public User(String name, int age, double salary, String relationship) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.relationship = relationship;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getRelationship() {
        return relationship;
    }
}
