package com.explorativeLeaening;

public class GenericsExample<T extends Animal> {
    public static String shout(Animal animal) {
        return animal.sound();
    }
}
