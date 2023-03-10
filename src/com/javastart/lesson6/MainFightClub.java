package com.javastart.lesson6;

public class MainFightClub {
    public static void main(String[] args) {
        Cat loriCat = new Cat();

        loriCat.setName("Lori");
        loriCat.setWeight(4);

        Cat baxter = new Cat();

        baxter.setName("Baxter");
        baxter.setWeight(10);

        FightClub fightClub = new FightClub();
        System.out.println("Winner: " + fightClub.fight(loriCat, baxter));

        loriCat.setWeight(12);
        System.out.println("New winner: " + fightClub.fight(loriCat, baxter));
    }
}
