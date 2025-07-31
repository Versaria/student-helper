package com.example.studenthelper;

public class Main {
    public static void main(String[] args) {
        StudentHelper helper = new StudentHelper();
        helper.sayHello("Егор Ермаков");
        helper.printAverageRating(3.494, 3.486, 1.607);
    }
}