package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Длина массива: " + ages.length);
        System.out.println("Длина массива: " + surnames.length);
        System.out.println("Длина массива: " + prices.length);

        String[] names = new String[4];
        names[0] = "Владислав Ильин";
        names[1] = "Николай Ильин";
        names[2] = "Петр Ильин";
        names[3] = "Иван Ильин";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
