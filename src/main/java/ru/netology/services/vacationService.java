package ru.netology.services;

public class vacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (count >= threshold) {
                count = count - expenses;
                count = count / 3;
                money++;
            } else {
                count = count + income;
                count = count - expenses;
            }
        }
        return money;
    }
}
