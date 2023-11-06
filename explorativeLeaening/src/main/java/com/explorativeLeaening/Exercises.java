// ARRAYLIST EXERCISES
package com.explorativeLeaening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Exercises {
    // exercise 1 - create and array
    public static ArrayList<String> createArray() {
        ArrayList<String> array_list = new ArrayList<>();
        array_list.add("red");
        array_list.add("blue");
        array_list.add("green");
        array_list.add("yellow");
        return array_list;
    }

    //exercise 2 - iterate an arrayList
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

    //exercise 3 - insert an element into the array list at the first position.
    public static void insertFirst() {
        ArrayList<Object> myArray = new ArrayList<>();
        myArray.add("Bingo");
        myArray.add("jack");
        myArray.add("Flout");
        myArray.add(0, "KiliGba");

        System.out.println(myArray);
    }

    // ex 5 - update an array by a given element
    public static ArrayList<Object> updateArray(String elem) {
        String[] list = {"king", "Queen", "Prince", "princess"};

        ArrayList<Object> myArray = new ArrayList<>(Arrays.asList(list));
        if (!myArray.contains(elem)) {
            myArray.add(elem);
        }
        return myArray;
    }

    //ex 8
    public static void reverseArray() {
        String[] list = {"king", "Queen", "Prince", "princess", "Knight", "Slave"};
        ArrayList<String> myArray = new ArrayList<>(Arrays.asList(list));
        ArrayList<String> tempArray = new ArrayList<>();
        tempArray = myArray;
        int var1 = 0;
        int var2 = (tempArray.size() - 1);
        while (var2 <= 0) {
            myArray.set(var1, tempArray.get(var2));
            var1++;
            var2--;
        }
//        System.out.println(Collections.reverse(myArray));
        System.out.println(tempArray);
    }

    // _________________________________________
    // SET EXERCISES
    // -----------------------------------------

    public static void createSet() {
        TreeSet<String> mySet = new TreeSet<>();
        mySet.add("Red");
        mySet.add("Green");
        mySet.add("Blue");
        mySet.add("Yellow");
        System.out.println(mySet);
    }

    public static void addBothSet() {
        TreeSet<String> mySet = new TreeSet<>();
        mySet.add("Red");
        mySet.add("Green");
        mySet.add("Blue");
        mySet.add("Yellow");

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Indigo");
        set2.add("Violet");
        set2.add("Orange");
        set2.add("Brown");

        System.out.println(set2);
        System.out.println("---------");

        set2.addAll(mySet);
        System.out.println(set2);

    }
}
