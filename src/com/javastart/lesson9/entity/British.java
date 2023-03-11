package com.javastart.lesson9.entity;

import java.util.Objects;

public class British extends Cat {
    private String name;

    public British(String owner, int age, String name) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        British british = (British) o;
        return Objects.equals(name, british.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
