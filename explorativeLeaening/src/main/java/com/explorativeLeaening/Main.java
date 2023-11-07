package com.explorativeLeaening;

import java.util.ArrayList;

import static com.explorativeLeaening.GenericsExample.shout;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------START---------");

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Dortmund", 2));
        animalList.add(new Dog("Flier", 35));
        animalList.add(new Cat("Stone", 5));
        animalList.add(new Dog("Stone", 5));

        for (Animal animal : animalList) {
            System.out.println(animal.getName() + "'s sound is: " + shout(animal) + "\n \t" +
                    animal.getName() + " is a " + animal.getClass().getSimpleName() + " and is " +
                    animal.getAge() + " years old.");
        }
    }
}