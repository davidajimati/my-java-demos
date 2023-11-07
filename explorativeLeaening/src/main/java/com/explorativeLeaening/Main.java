package com.explorativeLeaening;

import java.util.HashMap;

import static com.explorativeLeaening.Exercises.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------START---------");
//        createHashMap();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Dog");
        System.out.println(hashIsEmpty(hashMap));
    }
}