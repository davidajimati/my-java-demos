package com.explorativeLeaening;

public class Cat extends Animal {
    String name;
    int age;
    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String sound() {
        return "Meow";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
