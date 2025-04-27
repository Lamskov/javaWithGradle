package ru.mentee.power.coreDataTypes;

public class CurrencyConverter {
    public static void main(String[] args) {

        // Курсы валют
        final double USD_TO_RUB = 90.50;
        final double EUR_TO_RUB = 98.20;
        final double CNY_TO_RUB = 12.50;

        System.out.println("Курсы валют:");
        System.out.println("1 USD = " + USD_TO_RUB + " RUB");
        System.out.println("1 EUR = " + EUR_TO_RUB + " RUB");
        System.out.println("1 CNY = " + CNY_TO_RUB + " RUB");

        // Переменные для сумм
        double usdAmount = 100.0;
        double rubAmount = 100.0;
        double eurAmount = 50.0;
        double rubAmount2 = 1000.0;
        double cnyAmount = 250.0;

        // Конвертация
        double usdToRub = usdAmount * USD_TO_RUB;
        double rubToUsd = rubAmount / USD_TO_RUB;
        double eurToRub = eurAmount * EUR_TO_RUB;
        double rubToEur = rubAmount2 / EUR_TO_RUB;
        double cnyToRub = cnyAmount * CNY_TO_RUB;

        System.out.println("\nКонвертация:");
        System.out.printf("%.0f USD = %.2f RUB\n", usdAmount, usdToRub);
        System.out.printf("%.0f RUB = %.2f USD\n", rubAmount, rubToUsd);
        System.out.printf("%.0f EUR = %.2f RUB\n", eurAmount, eurToRub);
        System.out.printf("%.0f RUB = %.2f EUR\n", rubAmount2, rubToEur);
        System.out.printf("%.0f CNY = %.2f RUB\n", cnyAmount, cnyToRub);

        // Демонстрация проблемы точности
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;

        System.out.println("\nДемонстрация проблемы точности с double:");
        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("(0.1 + 0.2) == 0.3? " + (sum == 0.3));
    }
}
