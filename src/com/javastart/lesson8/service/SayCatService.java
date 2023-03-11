package com.javastart.lesson8.service;

import com.javastart.lesson8.entity.Cat;

public class SayCatService {
    public static String hello = "Hello from static!";

    public static void sayMeow() {
        System.out.println("Meow!");
    }

    public void say(Cat cat, String message) {
        System.out.println(concatNameAndMessage(cat.getName(), message));
    }

    private String concatNameAndMessage(String name, String message) {
        return name + " is say: " + message;
    }
}
