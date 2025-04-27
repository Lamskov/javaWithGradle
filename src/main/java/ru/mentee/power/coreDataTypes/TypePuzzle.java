package ru.mentee.power.coreDataTypes;

public class TypePuzzle {
    public static void main(String[] args) {
        System.out.println("Головоломка 1: Сравнение чисел с плавающей точкой");
        double x = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 == 0.3? " + (x == 0.3));
        System.out.println("Потому что: 0.1 + 0.2 = " + x);
        System.out.println("Решение через epsilon: " + (Math.abs(x - 0.3) < 0.0001));

        System.out.println("\nГоловоломка 2: Переполнение");
        int overflow = Integer.MAX_VALUE + 1;
        System.out.println("Integer.MAX_VALUE + 1 = " + overflow);
        System.out.println("Решение: использовать long или проверять переполнение заранее.");

        System.out.println("\nГоловоломка 3: Странное поведение char");
        System.out.println("'a' + 'b' = " + ('a' + 'b'));
        System.out.println("Решение: для конкатенации использовать строки: \"\" + 'a' + 'b' = " + ("" + 'a' + 'b'));

        System.out.println("\nГоловоломка 4: Автоупаковка/распаковка");
        Integer intObj = 128;
        Integer anotherIntObj = 128;
        System.out.println("Integer 128 == Integer 128? " + (intObj == anotherIntObj)); // false!
        System.out.println("Пояснение: сравниваются ссылки, не значения. Правильно: intObj.equals(anotherIntObj) = " + intObj.equals(anotherIntObj));
    }
}
