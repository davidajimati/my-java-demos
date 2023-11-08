package com.explorativeLeaening.generics;

public class Animal {
    String name;
    int age;
    static boolean canBreathe = true;
    static boolean canMove = true;
    static boolean canFeed = true;
//    public String sound;

    public String sound() {
        return "Ugh Ugh";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
