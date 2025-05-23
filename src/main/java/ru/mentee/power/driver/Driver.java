package ru.mentee.power.driver;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите ваш возраст: ");
        int ageDriver = scanner.nextInt();

        if (ageDriver >= 18) {
            System.out.printf("Есть и у вас водительско удостоверение?(введите true или false: ");
            boolean isDriversLicense = scanner.nextBoolean();
            if (isDriversLicense == true) {
                System.out.println("Вы можете арендовать авто!");
            } else {
                System.out.println("Из-за отсутствия прав вы не можете арендовать авто!");
            }
        } else {
            System.out.println("Несовершеннолетний. Вы пока не можете арендовать авто!");
        }

 /*       String status = (ageDriver >= 18) ? "Совершеннолетний. Вы можете арендовать авто!" : "Несовершеннолетний. Вы пока не можете арендовать авто!";
        System.out.println(status);*/
        scanner.close();
    }
}
