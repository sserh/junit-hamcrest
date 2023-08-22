package ru.raccoon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //метод определения положительного чётного числа
    public static boolean isNeededNumber(int value) {

        return (value > 0) && ((value % 2) == 0);
    }

    //метод определения количества слов в строке
    public static int wordsCount(String s) {

        String beforeResult = s.trim();
        String[] arrayString = beforeResult.split(" ");

        return arrayString.length;
    }
}