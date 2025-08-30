package ru.mentee.power.conditions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

    public class SmartThermostat {

        // TODO: Задайте значение константы для кода ошибки температуры
        private static final double ERROR_TEMP_CODE = -100.0; // Значение можно изменить

        // TODO: Заполните списки для рабочих дней и выходных
        private static final List<String> WEEKDAYS = Arrays.asList(/* Заполните дни недели ПН-ПТ */);
        private static final List<String> WEEKENDS = Arrays.asList(/* Заполните дни недели СБ-ВС */);

        /**
         * Определяет целевую температуру для термостата
         *
         * @param timeOfDay время суток в часах (0-23)
         * @param dayOfWeek день недели ("Понедельник", "Вторник", ..., "Воскресенье")
         * @param isOccupied есть ли кто-то дома
         * @param currentOutsideTemperature текущая температура на улице (в градусах Цельсия)
         * @return целевую температуру для установки или ERROR_TEMP_CODE в случае некорректных входных данных
         */
        public double getTargetTemperature(int timeOfDay, String dayOfWeek, boolean isOccupied,
                                           double currentOutsideTemperature) {
            // TODO: Реализуйте метод согласно требованиям
            // 1. Проверьте корректность входных данных (время, день недели)
            // 2. Определите базовую температуру в зависимости от дня недели, времени и присутствия
            // 3. Примените энергосберегающие правила

            return ERROR_TEMP_CODE; // Временная заглушка - измените на правильную реализацию
        }

        public static void main(String[] args) {
            SmartThermostat thermostat = new SmartThermostat();
            Scanner scanner = new Scanner(System.in);

            // TODO: Запросите у пользователя необходимые данные (время, день, занятость, темп. снаружи)
            // TODO: Вызовите метод getTargetTemperature и выведите результат
            // Пример:
            // System.out.println("Введите время суток (0-23):");
            // int time = scanner.nextInt();
            // ... (остальные запросы)
            // double targetTemp = thermostat.getTargetTemperature(time, day, occupied, outsideTemp);
            // if (targetTemp == ERROR_TEMP_CODE) {
            //     System.out.println("Ошибка: Некорректные входные данные.");
            // } else {
            //     System.out.println("Рекомендуемая температура: " + targetTemp + "°C");
            // }

            scanner.close();
        }
    }

