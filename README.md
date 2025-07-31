# Student Helper 🎓

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-11+-blue)
![JUnit](https://img.shields.io/badge/JUnit-4-red)
![Coverage](https://img.shields.io/badge/Coverage-100%25-brightgreen)

Проект для тестирования функционала проверки расчета среднего балла и приветствие студентов с использованием JUnit 4

## 🚀 Быстрый старт ++

### Требования
- Java JDK 11+
- Apache Maven 3.6+
- Git (для клонирования)

### Установка и запуск
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.versaria.App"
mvn test

```

## 📂 Структура проекта ++
```
student-helper/
├── src/
│   ├── main/java/com/versaria/
│   │   └── App.java
│   └── test/java/com/versaria/
│       └── AppTest.java
├── pom.xml
└── README.md
```

## 📋 Функционал

### Основные возможности ++
- ✅ Приветствие студентов
- ✅ Расчет среднего балла

## 📊 Покрытие тестами
-
-
-

## 💻 Пример работы ++
```bash
Добро пожаловать на курс, Егор Ермаков!
Средний балл по итогам трёх семестров 2.8623333333333334
```

## 📜 Лицензия ++
MIT License. Полный текст доступен в файле [LICENSE](LICENSE).

## 🤝 Как внести вклад ++
1. Форкните репозиторий
2. Создайте ветку (`git checkout -b feature/improvement`)
3. Сделайте коммит (`git commit -am 'Add new test cases'`)
4. Запушьте ветку (`git push origin feature/improvement`)
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
