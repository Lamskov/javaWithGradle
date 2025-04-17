package ru.mentee.power.mp19;

public class StringOperations {
    public static void main(String[] args) {
        // Создание строковых и символьных переменных
        String str1 = "Hello";
        String str2 = "World";
        char ch = 'A';
        int number = 42;
        String numStr = "100";
        String javaStr = "Java";

        // 1. Конкатенация строк
        String concatenation = str1 + str2;

        // 2. Преобразование символа в строку
        String charToString = Character.toString(ch);

        // 3. Преобразование числа в строку и обратно
        String numberToString = Integer.toString(number);
        int stringToNumber = Integer.parseInt(numStr);

        // 4. Извлечение символа из строки
        char extractedChar = javaStr.charAt(1);

        // Вывод результатов
        System.out.printf("Конкатенация: \"%s\" + \"%s\" = \"%s\"%n", str1, str2, concatenation);
        System.out.printf("Символ в строку: '%c' -> \"%s\"%n", ch, charToString);
        System.out.printf("Число в строку: %d -> \"%s\"%n", number, numberToString);
        System.out.printf("Строка в число: \"%s\" -> %d%n", numStr, stringToNumber);
        System.out.printf("Символ из строки \"%s\": индекс 1 -> '%c'%n", javaStr, extractedChar);
    }
}
