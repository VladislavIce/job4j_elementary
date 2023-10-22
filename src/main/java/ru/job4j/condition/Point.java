package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        int subtractArgumentX = x2 - x1;
        int subtractArgumentY = y2 - y1;
        double raiseToDegreeOperationsOne = Math.pow(subtractArgumentX, 2);
        double raiseToDegreeOperationsTwo = Math.pow(subtractArgumentY, 2);
        double addResultOperationThreeAndFour = raiseToDegreeOperationsOne + raiseToDegreeOperationsTwo;
        return Math.sqrt(addResultOperationThreeAndFour);
    }

    public static void main(String[] args) {
        double result = distance(5, 10, 15, 10);
        System.out.println("result (5, 10) to (15, 10) " + result);

    }
}



