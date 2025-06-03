package ru.mentee.power.conditions;

import java.util.Scanner;


public class CreditCalculator {
    public static final double MORTGAGE_LOAN = 9.0;
    public static final double CONSUMER_LOAN = 15.0;
    public static final double CAR_LOAN = 12.0;

    public static final double MIN_LOAN_AMOUNT = 10_000;
    public static final double MAX_LOAN_AMOUNT = 10_000_000;
    public static final int MIN_TERM = 1;
    public static final int MAX_TERM = 360;

    public static final int MIN_CREDIT_SCORE = 300;
    public static final int MAX_CREDIT_SCORE = 850;

    public double calculateMonthlyPayment(double loanAmount, int loanTermMonths, String creditType, int creditScore) {

        if (loanAmount < MIN_LOAN_AMOUNT || loanAmount > MAX_LOAN_AMOUNT
                || loanTermMonths < MIN_TERM || loanTermMonths > MAX_TERM
                || creditScore < MIN_CREDIT_SCORE || creditScore > MAX_CREDIT_SCORE) {
            return -1;
        }

        double baseRate;

        switch (creditType) {
            case "Ипотека":
                baseRate = MORTGAGE_LOAN;
                break;
            case "Потребительский":
                baseRate = CONSUMER_LOAN;
                break;
            case "Автокредит":
                baseRate = CAR_LOAN ;
                break;
            default:
                return -1; // неизвестный тип кредита
        }

        // корректировка ставки по кредитному рейтингу
        if (creditScore >= 750) {
            baseRate -= 2;
        } else if (creditScore >= 650) {
            baseRate -= 1;
        } else if (creditScore >= 500) {
            // ставка не меняется
        } else {
            baseRate += 3;
        }

        // перевод ставки в месячную
        double monthlyRate = baseRate / 12 / 100;

        // ежемес. расчёт
        double monthlyPayment = loanAmount * (monthlyRate * Math.pow(1 + monthlyRate, loanTermMonths))
                / (Math.pow(1 + monthlyRate, loanTermMonths) - 1);

        return monthlyPayment;


    }

    public static void main(String[] args) {
        CreditCalculator calculator = new CreditCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму кредита (от 10.000 до 10.000.000): ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Введите срок кредита в месяцах (от 1 до 360): ");
        int loanTerm = scanner.nextInt();
        scanner.nextLine(); // чтобы считать строку после числа

        System.out.print("Введите тип кредита (Ипотека, Потребительский, Автокредит): ");
        String creditType = scanner.nextLine();

        System.out.print("Введите кредитный рейтинг (от 300 до 850): ");
        int creditScore = scanner.nextInt();

        double result = calculator.calculateMonthlyPayment(loanAmount, loanTerm, creditType, creditScore);

        if (result == -1) {
            System.out.println("Ошибка: введены некорректные данные.");
        } else {
            System.out.printf("Ежемесячный платеж: %.2f руб.%n", result);
        }

        scanner.close();
    }
}
