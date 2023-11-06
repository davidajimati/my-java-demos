package com.explorativeLeaening;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println(createArray());
        iterateArray();
    }

    // exercise 1
    public static ArrayList<String> createArray() {
        ArrayList<String> array_list = new ArrayList<>();
        array_list.add("red");
        array_list.add("blue");
        array_list.add("green");
        array_list.add("yellow");
        return array_list;
    }

    //exercise 2
    public static void iterateArray() {
        ArrayList<Object> my_array = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        my_array.add("God");
        my_array.add("[1, 2, 3, 4, 5, 6]");
        my_array.add("is ");
        my_array.add("Good");
        my_array.add("Everyday");
        my_array.add("Everytime");
        my_array.add("in");
        my_array.add("every season");
        my_array.add(numbers);

        for (Object entry : my_array) {
            if (entry instanceof ArrayList<?>) {
                for (int i = 0; i < ((ArrayList<?>) entry).size(); i++) {
                    System.out.println(((ArrayList<?>) entry).get(i));
                }
                continue;
            }
            System.out.println(entry);
        }
    }
}