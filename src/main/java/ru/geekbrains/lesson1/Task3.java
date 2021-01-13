package ru.geekbrains.lesson1;

public class Task3 {
    //Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    public static void main(String[] args) {
        System.out.println(calculateMethod(2.0F, 3.2F, 4.3F, 5.4F));
    }

    public static float calculateMethod(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }
}
