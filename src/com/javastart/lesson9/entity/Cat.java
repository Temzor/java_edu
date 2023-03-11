package com.javastart.lesson9.entity;

public class Cat {
    private String owner;
    private int age;

    public Cat(String owner, int age) {
        this.owner = owner;
        this.age = age;
    }

   public void sayMeow() {
        System.out.println("Meow!");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
