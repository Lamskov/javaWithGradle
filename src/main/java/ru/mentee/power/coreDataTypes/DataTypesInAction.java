package ru.mentee.power.coreDataTypes;

public class DataTypesInAction {
    public static void main(String[] args) {

                // Переменные разных типов
                int a = 7;
                double b = 2.0;
                byte byte1 = 10;
                byte byte2 = 20;
                double d = 3.75;
                long bigNumber = 1_000_000_000_000L;
                boolean bool1 = true;
                boolean bool2 = false;
                char ch = 'A';

                // 1. Целочисленное деление
                int intDivision = a / 2;
                System.out.println("1. Целочисленное деление:");
                System.out.println("   7 / 2 = " + intDivision + " (дробная часть отбрасывается)");

                // 2. Деление с плавающей точкой
                double doubleDivision = a / b;
                System.out.println("\n2. Деление с плавающей точкой:");
                System.out.println("   7 / 2.0 = " + doubleDivision + " (результат с плавающей точкой)");

                // 3. Явное приведение типов
                int dToInt = (int) d;
                char intToChar = (char) 65;
                int longToInt = (int) bigNumber;
                System.out.println("\n3. Явное приведение типов:");
                System.out.println("   double 3.75 к int: " + dToInt);
                System.out.println("   int 65 к char: '" + intToChar + "'");
                System.out.println("   long 1000000000000 к int: " + longToInt + " (переполнение)");

                // 4. Автоматическое повышение типа
                int sumBytes = byte1 + byte2; // byte + byte -> int
                double intDoubleMultiplication = 5 * 2.5;
                System.out.println("\n4. Автоматическое повышение типа:");
                System.out.println("   byte + byte = int: 10 + 20 = " + sumBytes);
                System.out.println("   int * double = double: 5 * 2.5 = " + intDoubleMultiplication);

                // 5. Операции с boolean
                System.out.println("\n5. Операции с boolean:");
                System.out.println("   true && false = " + (bool1 && bool2));
                System.out.println("   true || false = " + (bool1 || bool2));
                System.out.println("   !true = " + (!bool1));

                // 6. Работа с символами
                System.out.println("\n6. Работа с символами:");
                System.out.println("   Символ 'A' имеет код: " + (int) ch);
                char nextChar = (char) (ch + 1);
                System.out.println("   Символ с кодом 66: '" + nextChar + "'");
                System.out.println("   'A' + 1 = '" + nextChar + "' (символ сдвигается на 1 позицию)");
    }
}