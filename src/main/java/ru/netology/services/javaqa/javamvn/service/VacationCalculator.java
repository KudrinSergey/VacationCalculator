package ru.netology.services.javaqa.javamvn.service;

public class VacationCalculator {
    public int calculateMonthsOfVacation(int income, int expenses, int threshold) {
        int money = 0;
        int MonthsOfVacation = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                MonthsOfVacation++;
            } else {
                money += income - expenses;
            }
        }

        return MonthsOfVacation;
    }
}