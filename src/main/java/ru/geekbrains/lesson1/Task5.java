package ru.geekbrains.lesson1;

public class Task5 {
    public static void main(String[] args) {
        //Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль,положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом
        positiveNegative(0);

    }

    public static void positiveNegative(int number) {
        if (number >= 0) {
            System.out.println("Заданное число является положительным");
        } else {
            System.out.println("Заданное число является отрицательным");
        }
    }
}
