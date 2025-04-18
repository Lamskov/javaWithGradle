package ru.mentee.power.datatypes;

public class Datatypes {
    public static void main(String[] args) {
        int intVar = 10;
        double doubleVar = 5.5;
        float floatVar = 2.5f;
        long longVar = 100000L;
        short shortVar = 1000;
        byte byteVar = 100;
        char charVar = 'A';
        boolean boolVar = true;


        String str1 = "Привет";

        int[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Один", "Два", "Три"};

        // Преобразование типов
        double intToDouble = intVar; // автоматическое расширение типа
        int doubleToInt = (int) doubleVar; // явное сужение типа

        System.out.println("=== Примитивные типы ===");
        System.out.println("int: " + intVar);
        System.out.println("double: " + doubleVar);
        System.out.println("float: " + floatVar);
        System.out.println("long: " + longVar);
        System.out.println("short: " + shortVar);
        System.out.println("byte: " + byteVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("char: " + charVar);

        System.out.println("\n Строки");
        System.out.println("Строка 1: " + str1);

        System.out.println("\n массивы");
        System.out.print("массив целых чисел: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("массив строк: ");
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        System.out.println();


        System.out.println("\n=== Преобразование типов ===");
        System.out.println("int в double: " + intToDouble);
        System.out.println("double в int: " + doubleToInt);

    }
}
