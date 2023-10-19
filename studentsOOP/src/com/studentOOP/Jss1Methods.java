package com.studentOOP;

public class Jss1Methods {
    public static void main(String[] args) {
        JSS1 david = new JSS1(16, "David", 2);
        david.studentID = david.IdEngine();

        JSS1 samson = new JSS1(34, "Samson", 4);
        samson.studentID = samson.IdEngine();

        JSS1 tolu = new JSS1(14, "toluwalase", 1);
        tolu.studentID = tolu.IdEngine();


        System.out.println("David's ID; " + david.studentID);
        System.out.println("Samson's ID; " + samson.studentID);
        System.out.println("Tolu's ID; " + tolu.studentID);
        System.out.println("David's postion: " + david.getPosition(david.studentID));
    }
}
