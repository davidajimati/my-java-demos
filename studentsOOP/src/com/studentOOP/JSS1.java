package com.studentOOP;

public class JSS1 {
    static String grade = "JSS1";
    public String studentID;
    private int age;
    String name;
    int position;

    public JSS1(int age, String name, int position) {
        this.age = age;
        this.name = name;
        this.position = position;
    }

    // use setters and getters for age and position
    // verify if the studentID is correct before returning the position

    int getAge(String ID) {
        if (ID == this.studentID)
            return this.age;
        return 0;
    }

    void setAge(int value) {
        this.age = value;
    }

    int getPosition(String ID) {
        if (ID == this.studentID)
                return this.position;
        return 0;
    }

    void setPosition(String ID, int val) {
        if (ID == this.studentID)
            this.position = val;
    }

    String getStudentID() {
        return this.studentID;
    }
    public String IdEngine() {
        String firstChar = String.valueOf(this.name.charAt(0));
        String MidChar = String.valueOf(this.name.charAt(name.length() / 2));
        String lastChar = String.valueOf(this.name.charAt(this.name.length() - 1));
        int figure = (14567 / this.age);
        return((String)firstChar+MidChar+lastChar+figure).toUpperCase();
    }
}
