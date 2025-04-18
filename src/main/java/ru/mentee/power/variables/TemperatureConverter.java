package ru.mentee.power.variables;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Определение константы абсолютного нуля в Кельвинах
        final double ABSOLUTE_ZERO_K = 0.0;

        // Исходные температуры
        double celsius = 25.0;
        double fahrenheit = 77.0;
        double kelvin = 300.0;

        // Конвертация температур
        double cToF = (celsius * 9 / 5) + 32;
        double fToC = (fahrenheit - 32) * 5 / 9;
        double cToK = celsius + 273.15;
        double kToC = kelvin - 273.15;

        // Вывод результатов
        System.out.printf("%.2f °C -> %.2f °F%n", celsius, cToF);
        System.out.printf("%.2f °F -> %.2f °C%n", fahrenheit, fToC);
        System.out.printf("%.2f °C -> %.2f K%n", celsius, cToK);
        System.out.printf("%.2f K -> %.2f °C%n", kelvin, kToC);
    }
}
