package com.javastart.lesson10.entiry;

import com.javastart.lesson10.service.AbstractAnimal;

public class Cat extends AbstractAnimal {
    @Override
    public void say() {
        System.out.println("Meow-meow!");
    }
}
