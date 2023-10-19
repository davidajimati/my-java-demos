package com.studentOOP;

public class Jss1Methods {
    public static void main(String[] args) {
        JSS1 david = new JSS1(16, "David", 2);
        david.studentID = david.IdEngine();

        JSS1 samson = new JSS1(34, "Samson", 4);
        david.studentID = samson.IdEngine();


        System.out.println("David's ID; " + david.studentID);
        System.out.println("Samson's ID; " + samson.studentID);
    }
}
