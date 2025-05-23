package ru.mentee.power.datatype;

public class MenteeDemo {
    public static void main(String[] args) {
        Mentee menteeDmitriy = new Mentee("Dmitriy", "Petrov", 22, 3.5,6);
        System.out.println(menteeDmitriy);
        System.out.println("\nЯвляетесь ли вы отличником: " + menteeDmitriy.isExcellent());
        menteeDmitriy.displayInfo();

        Mentee menteeAlex = new Mentee("Alex", "Petrov", 3, 4.6,5);
        System.out.println(menteeAlex);
        System.out.println("\nЯвляетесь ли вы отличником: " + menteeAlex.isExcellent());
        menteeAlex.displayInfo();
    }
}
