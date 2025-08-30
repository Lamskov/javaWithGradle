package ru.mentee.power.loop;

public class ForLoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 0, -3, 8, -1};
        int firstNegative = 0; // Переменная для хранения результата


        System.out.println("Ищем первое отрицательно число: ");
        for (int number : numbers) {
            System.out.println("Сейчас на проверке: " + number);
            if (number < 0) {
                firstNegative = number;
                System.out.println("Нашли! Это: " + firstNegative);
                break;
            }
        }
    }
}
