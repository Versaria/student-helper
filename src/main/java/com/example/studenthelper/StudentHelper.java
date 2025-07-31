package com.example.studenthelper;

public class StudentHelper {

    public void sayHello(String name) {
        System.out.println("Добро пожаловать на курс, " + name + "!");
    }

    public void printAverageRating(double firstSemesterRating,
                                   double secondSemesterRating,
                                   double thirdSemesterRating) {
        double averageRating = calculateAverageRating(firstSemesterRating,
                secondSemesterRating,
                thirdSemesterRating);
        System.out.println("Средний балл по итогам трёх семестров " + averageRating);
    }

    public double calculateAverageRating(double firstSemesterRating,
                                         double secondSemesterRating,
                                         double thirdSemesterRating) {
        return (firstSemesterRating + secondSemesterRating + thirdSemesterRating) / 3;
    }
}