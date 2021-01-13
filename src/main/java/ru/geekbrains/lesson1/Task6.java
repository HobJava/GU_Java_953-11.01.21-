package ru.geekbrains.lesson1;

public class Task6 {
    //Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static void main(String[] args) {
        System.out.println(positiveNegative(-3));

    }

    public static boolean positiveNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }
}
