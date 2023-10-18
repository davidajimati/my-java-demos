package com.studentOOP;

public class Student {
    String name;
    int age;
    String studentID = idGenerator();
    String grade;

    public String aboutStudent() {
        return ("the student name is " + this.name + '\n' + "The clas is: " + this.grade + '\n' + this.name + " is "
        + this.age + " years old");
    }

    private String idGenerator() {
        String generated_ID = (this.name.charAt(0) + this.name.charAt(2)) + this.grade;
        return generated_ID;
    }
}

Student David = new Student("David", 18, "JSS1");