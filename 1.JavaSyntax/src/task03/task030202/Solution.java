package task03.task030202;

import java.util.Scanner;

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double bodyTemp = s.nextDouble();
        boolean isHigh = (bodyTemp > 37);
        boolean isLow = (bodyTemp < 36);

        // мой код
        if (isHigh) {
            System.out.println("Температура тела высокая");
        } else if (isLow) {
            System.out.println("Температура тела низкая");
        } else {
            System.out.println("Темперутара тела нормальная");
        }
        }
        }