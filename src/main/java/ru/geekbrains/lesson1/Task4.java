package ru.geekbrains.lesson1;

public class Task4 {
    //Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false
    public static void main(String[] args) {
        System.out.println(limit(10, 25));
    }

    public static boolean limit(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
