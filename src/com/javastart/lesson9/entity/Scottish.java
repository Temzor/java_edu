package com.javastart.lesson9.entity;

public class Scottish extends Cat {
    private String name;

    public Scottish(String owner, int age, String name) {
        super(owner, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat name: " + name + ", age: " + getAge() + ", owner: " + getOwner();
    }
}
