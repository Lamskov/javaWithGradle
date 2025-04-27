package ru.mentee.power.coreDataTypes;

public class SmartCalculator {
    public static void main(String[] args) {
        System.out.println("Умный калькулятор:\n");

        // Сложение целых чисел
        int sum = 5 + 3;
        System.out.println("Сложение: 5 + 3 = " + sum + " (тип: int)");

        // Вычитание дробных чисел
        double diff = 5.5 - 2.2;
        System.out.println("Вычитание: 5.5 - 2.2 = " + diff + " (тип: double)");

        // Умножение int на double
        double multiplication = 4 * 2.5;
        System.out.println("Умножение: 4 * 2.5 = " + multiplication + " (тип: double)");

        // Деление double
        double division = 10.0 / 3;
        System.out.println("Деление: 10 / 3 = " + division + " (тип: double)");

        // Деление целочисленное
        int intDivision = 10 / 3;
        System.out.println("Деление целочисленное: 10 / 3 = " + intDivision + " (тип: int)");

        // Остаток от деления
        int remainder = 10 % 3;
        System.out.println("Остаток от деления: 10 % 3 = " + remainder + " (тип: int)");

        // Возведение в степень
        double power = Math.pow(2, 10);
        System.out.println("Возведение в степень: 2^10 = " + power + " (тип: double)");

        // Обработка деления на ноль
        System.out.println("\nОбработка особых случаев:");
        System.out.println("Попытка деления на ноль (для double): " + (5.0 / 0)); // Infinity
        try {
            System.out.println("Попытка деления на ноль (для int): " + (5 / 0));
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль (для int): " + e);
        }
    }
}
