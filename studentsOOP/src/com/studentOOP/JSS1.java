package com.studentOOP;

public class JSS1 {
    static String grade = "JSS1";
    public String studentID;
    private int _age;
    String name;
    private int _position;
    public JSS1(int age, String name, int position) {
        this._age = age;
        this.name = name;
        this._position = position;
    }

    // use setters and getters for age and position
    // verify if the studentID is correct before returning the position

    int getAge(String ID) {
        if (ID == this.studentID)
            return this._age;
        return 0;
    }

    void setAge(int value) {
        this._age = value;
    }

    int getPosition(String ID) {
        if (ID == this.studentID)
                return this._position;
        return 0;
    }

    void setPosition(String ID, int val) {
        if (ID == this.studentID)
            this._position = val;
    }

    String getStudentID() {
        return this.studentID;
    }
    public String IdEngine() {
        String firstChar = String.valueOf(this.name.charAt(0));
        String MidChar = String.valueOf(this.name.charAt(name.length() / 2));
        String lastChar = String.valueOf(this.name.charAt(this.name.length() - 1));
        int figure = (14567 / this._age);
        return((String)firstChar+MidChar+lastChar+figure).toUpperCase();
    }
}
