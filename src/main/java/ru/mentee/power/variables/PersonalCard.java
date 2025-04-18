package ru.mentee.power.variables;

public class PersonalCard {
    public static void main(String[] args) {
        String toDoName = " ===== ЛИЧНАЯ КАРТОЧКА =====";
        String toDoNameEnd = "==========================";

        String firstName = "Иван";
        String lastName = "Иванов";
        int age = 25;
        String city = "Москва";
        double height = 180.0;
        double weight = 70.5;
        boolean isStudent = true;
        char firstLetterIsName = 'И';

        System.out.printf("%s%n Имя: %s%n Фамилия: %s%n Возраст: %d%n Город: %s%n Рост: %s%n Вес: %s%n Студент: %b%n Первая буква имени: %c%n %s",
                toDoName, firstName, lastName, age, city, height, weight, isStudent, firstLetterIsName, toDoNameEnd);
    }
}
