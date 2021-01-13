package ru.geekbrains.lesson1;

import java.util.Scanner;

public class Task7 {
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void main(String[] args) {
        hello("Олег");

    }

    public static void hello(String name) {
        System.out.println("Привет, " + name);
    }
}
