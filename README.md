# Student Helper 🎓 Project

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-11+-blue)
![JUnit](https://img.shields.io/badge/JUnit-4-red)
![Coverage](https://img.shields.io/badge/Coverage-100%25-brightgreen)

Проект Student Helper предоставляет простые методы для работы со студенческими данными:
- Приветствие студентов
- Расчет среднего балла


## 🚀 Быстрый старт

### Требования
- Java JDK 11+
- Apache Maven 3.6+
- Git (для клонирования)

### Установка и запуск

```bash
git clone https://github.com/Versaria/student-helper.git
cd student-helper
mvn clean package
java -cp target/student-helper-1.0-SNAPSHOT.jar com.example.studenthelper.Main
```

## 📂 Структура проекта
```
student-helper/
├── src/
│   ├── main/
│   │   └── java/com/example/studenthelper/
│   │       ├── Main.java            # Точка входа
│   │       └── StudentHelper.java   # Основная логика
│   └── test/
│       └── java/com/example/studenthelper/
│           └── StudentHelperTest.java # Тесты
├── pom.xml                          # Конфигурация Maven
└── .gitignore
```

## 📋 Функционал
### Основные методы:
- `sayHello(String name)` - Приветствие студента
  ```java
  helper.sayHello("Анна Петрова");
  ```
  Вывод: `Добро пожаловать на курс, Анна Петрова!`

- `calculateAverageRating()` - Расчет среднего балла
  ```java
  double avg = helper.calculateAverageRating(4.5, 3.8, 4.2);
  ```

- `printAverageRating()` - Печать среднего балла
  ```java
  helper.printAverageRating(4.5, 3.8, 4.2);
  ```
  Вывод: `Средний балл по итогам трёх семестров 4.166...`

## 📊 Покрытие тестами
Проект включает unit-тесты для всех основных методов:
- Тестирование корректности расчетов
- Проверка граничных значений
- Интеграционное тестирование

Запуск тестов:
```bash
mvn test
```

## 💻 Пример работы
```java
public static void main(String[] args) {
    StudentHelper helper = new StudentHelper();
    helper.sayHello("Егор Ермаков");
    helper.printAverageRating(3.494, 3.486, 1.607);
}
```

Вывод:
```
Добро пожаловать на курс, Егор Ермаков!
Средний балл по итогам трёх семестров 2.8623333333333334
```

## 📜 Лицензия
Проект распространяется под лицензией [MIT](LICENSE).

## 🤝 Как внести вклад
1. Форкните репозиторий
2. Создайте ветку для новой фичи (`git checkout -b feature/awesome-feature`)
3. Сделайте коммит изменений (`git commit -m 'Add some feature'`)
4. Запушите ветку (`git push origin feature/awesome-feature`)
5. Откройте Pull Request

---

<details>
<summary>🔧 Дополнительные команды</summary>

```bash
# Запуск конкретного тестового класса
mvn test -Dtest=ProgramTest

# Сборка с подробным отчетом
mvn surefire-report:report
```
</details>
