package com.studentOOP;

public class JSS1 {
    static String grade = "JSS1";
    public String studentID;
    int age;
    String name;
    int position;

    public JSS1(int age, String name, int position) {
        this.age = age;
        this.name = name;
        this.position = position;
    }
    public String IdEngine() {
        String firstChar = String.valueOf(this.name.charAt(0));
        String MidChar = String.valueOf(name.charAt(name.length() / 2));
        String lastChar = String.valueOf(name.charAt(4));
        int figure = (14567 / this.age);
        return((String)firstChar+MidChar+lastChar+figure).toUpperCase();
    }
}
