package com.javastart.lesson6;

public class FightClub {
    public String fight(Cat firstCat, Cat secondCat) {
        if (firstCat.getWeight() >= secondCat.getWeight()) {
            return firstCat.getName();
        } else {
            return secondCat.getName();
        }
    }
}
