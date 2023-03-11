package com.javastart.lesson8;

import com.javastart.lesson8.entity.Cat;
import com.javastart.lesson8.service.SayCatService;

public class MainConstructor {
    public static void main(String[] args) {
        Cat lori = new Cat("Lori");
        SayCatService sayCatService = new SayCatService();
        sayCatService.say(lori, "I want to eat!");

        Cat bax = new Cat("Bax");
        sayCatService.say(bax, "I want to sleep!");

        Cat martin = new Cat("Martin");
        sayCatService.say(martin, "I want to play!");

        SayCatService.sayMeow();
        System.out.println(SayCatService.hello);
    }
}
