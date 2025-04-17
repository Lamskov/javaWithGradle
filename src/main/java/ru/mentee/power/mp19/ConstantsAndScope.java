package ru.mentee.power.mp19;

public class ConstantsAndScope {

    static final double PI = 3.14159;

    public static void main(String[] args) {
        // Объявление локальных переменных и констант
        final int LOCAL_CONSTANT = 100;
        int localVariable = 10;

        // Блок с локальными переменными
        {
            int blockVariable = 5;
            System.out.println("Внутри блока: blockVariable = " + blockVariable);
        }

        // Попытка обратиться к blockVariable вне блока вызовет ошибку
        // Ошибка: переменная не видна за пределами блока

        // Вывод доступных переменных
        System.out.println("Локальная переменная: " + localVariable);
        System.out.println("Локальная константа: " + LOCAL_CONSTANT);
        System.out.println("Константа класса PI: " + PI);

        // Вызов метода с локальными переменными
        someMethod();
    }

    public static void someMethod() {
        // Локальные переменные метода
        String methodVariable = "Hello from method";
        System.out.println(methodVariable);

        // Попытка обратиться к localVariable вызовет ошибку, тк она объявлена в другом методе и не видна здесь
        // Ошибка: localVariable не видна
    }
}
