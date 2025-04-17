package ru.mentee.power.mp19;

public class TypeCalculator {
    public static void main(String[] args) {
        // Объявление переменных различных типов
        byte b = 5;
        short s = 10;
        int i = 1000;
        long l = 20000L;
        float f = 3.5f;
        double d = 5.5;

        // Операции между переменными разных типов
        int result1 = b + s;
        int result2 = i * b;
        double result3 = d + i;
        int result4 = i / b;
        double result5 = (double) i / b;
        long result6 = l + i;
        float result7 = f * b;
        double result8 = d / f;

        // Вывод результатов с указанием типов
        System.out.printf("byte (%d) + short (%d) = %d (int)%n", b, s, result1);
        System.out.printf("int (%d) * byte (%d) = %d (int)%n", i, b, result2);
        System.out.printf("double (%.1f) + int (%d) = %.1f (double)%n", d, i, result3);
        System.out.printf("int (%d) / byte (%d) = %d (int)%n", i, b, result4);
        System.out.printf("int (%d) / byte (%d) (с приведением) = %.1f (double)%n", i, b, result5);
        System.out.printf("long (%d) + int (%d) = %d (long)%n", l, i, result6);
        System.out.printf("float (%.1f) * byte (%d) = %.1f (float)%n", f, b, result7);
        System.out.printf("double (%.1f) / float (%.1f) = %.2f (double)%n", d, f, result8);
    }
}
