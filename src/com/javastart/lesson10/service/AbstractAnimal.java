package com.javastart.lesson10.service;

public abstract class AbstractAnimal implements Animal {
    private String name;
    private int age;
    private String owner;

    @Override
    public abstract void say();

    @Override
    public void setOwner(String owner) {
        this.owner = owner;
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

    public String getOwner() {
        return owner;
    }
}
