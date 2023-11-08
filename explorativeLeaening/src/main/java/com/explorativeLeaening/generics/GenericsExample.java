package com.explorativeLeaening.generics;

public class GenericsExample<T extends Animal> {
    public static String shout(Animal animal) {
        return animal.sound();
    }
}
