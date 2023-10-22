package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void testRubleToEuro() {
        float inRuble = 350;
        float expected = 5;
        float outEuro = rubleToEuro(inRuble);
        boolean resultTest = expected == outEuro;
        System.out.println("350 rubles are 5 euro. Test result : " + resultTest);
    }

    public static void testRubleToDollar() {
        float inRuble = 300;
        float expected = 5;
        float outDollar = rubleToDollar(inRuble);
        boolean resultTest = expected == outDollar;
        System.out.println("300 rubles are 5 dollar. Test result : " + resultTest);
    }


    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(2000);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("2000 rubles are " + dollar + " euro.");
        testRubleToEuro();
        testRubleToDollar();
    }
}
