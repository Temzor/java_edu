package com.javastart.lesson9;

import com.javastart.lesson9.entity.British;
import com.javastart.lesson9.entity.Scottish;

public class MainInheritance {
    public static void main(String[] args) {
        British british = new British("Dmitrii", 4, "Lori");
        Scottish scottish = new Scottish("Alex", 8, "Baxter");

        british.sayMeow();
        scottish.sayMeow();

        System.out.println("Cat name: " + british.getName() + ", age: " + british.getAge()
        + ", owner: " + british.getOwner());
        System.out.println("Cat name: " + scottish.getName() + ", age: " + scottish.getAge()
        + ", owner: " + scottish.getOwner());


        System.out.println(british.toString());
        System.out.println(scottish.toString());

        British martin = new British("Dmitrii", 4, "Lori");
        British anotherMartin = new British("Dmitrii", 4, "Lori");

        System.out.println(martin == anotherMartin);
        System.out.println(martin.equals(anotherMartin));

    }
}
