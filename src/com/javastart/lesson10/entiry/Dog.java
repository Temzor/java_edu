package com.javastart.lesson10.entiry;

import com.javastart.lesson10.service.AbstractAnimal;
public class Dog extends AbstractAnimal {
    @Override
    public void say() {
        System.out.println("Woof-woof!");
    }
}
