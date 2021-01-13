package ru.geekbrains.lesson1;

public class Task8 {
    public static void main(String[] args) {
        //Написать метод, который определяет,
        // является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
        leapYear(2000);

    }

    public static void leapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Год високосный");
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный");
        }
        else if (year % 4 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
