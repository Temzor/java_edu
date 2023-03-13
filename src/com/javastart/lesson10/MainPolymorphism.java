package com.javastart.lesson10;

import com.javastart.lesson10.entiry.Cat;
import com.javastart.lesson10.entiry.Dog;
import com.javastart.lesson10.service.AbstractAnimal;
import com.javastart.lesson10.service.Animal;


public class MainPolymorphism {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.say();
        dog.say();

        findOwner(cat);
        findOwner(dog);

        System.out.println("Cat: " + cat.getOwner());
        System.out.println("Dog: " + dog.getOwner());

    }

    private static void findOwner(Animal animal) {
        if (animal.getClass() == Cat.class) {
            animal.setOwner("Cat_Owner");
        }
        if (animal.getClass() == Dog.class) {
            animal.setOwner("Dog_Owner");
        }
    }
}
