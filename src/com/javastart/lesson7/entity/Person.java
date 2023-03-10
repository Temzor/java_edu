package com.javastart.lesson7.entity;

public class Person {
    private String firstName;
    private String surName;
    private int phoneNumber;

    public Person(String firstName, String surName, int phoneNumber) {
        this.firstName = firstName;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
