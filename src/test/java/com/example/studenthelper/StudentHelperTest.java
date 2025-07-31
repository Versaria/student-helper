package com.example.studenthelper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentHelperTest {
    private final StudentHelper helper = new StudentHelper();

    @Test
    void sayHello_ShouldPrintCorrectWelcomeMessage() {
        // Проверяем, что метод не выбрасывает исключений
        assertDoesNotThrow(() -> helper.sayHello("Тестовый Студент"));

        // Можно также проверить вывод в консоль, но это сложнее в unit-тестах
    }

    @Test
    void calculateAverageRating_ShouldReturnCorrectAverage() {
        // Тест 1: обычные значения
        assertEquals(3.0, helper.calculateAverageRating(2.5, 3.0, 3.5), 0.0001);

        // Тест 2: одинаковые значения
        assertEquals(4.0, helper.calculateAverageRating(4.0, 4.0, 4.0), 0.0001);

        // Тест 3: отрицательные значения (если такие возможны)
        assertEquals(0.0, helper.calculateAverageRating(-1.0, 0.0, 1.0), 0.0001);

        // Тест 4: значения из примера
        assertEquals(2.862333, helper.calculateAverageRating(3.494, 3.486, 1.607), 0.0001);
    }

    @Test
    void printAverageRating_ShouldPrintCorrectAverage() {
        // Проверяем, что метод не выбрасывает исключений с разными входными данными
        assertDoesNotThrow(() -> helper.printAverageRating(4.8, 4.5, 3.9));
        assertDoesNotThrow(() -> helper.printAverageRating(0.0, 0.0, 0.0));
        assertDoesNotThrow(() -> helper.printAverageRating(5.0, 5.0, 5.0));

        // Проверяем работу с граничными значениями
        assertDoesNotThrow(() -> helper.printAverageRating(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
        assertDoesNotThrow(() -> helper.printAverageRating(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE));
    }

    @Test
    void integrationTest_MainScenario() {
        // Интеграционный тест, проверяющий основной сценарий использования
        assertDoesNotThrow(() -> {
            StudentHelper helper = new StudentHelper();
            helper.sayHello("Интеграционный Тест");
            helper.printAverageRating(3.5, 4.0, 4.5);
        });
    }
}