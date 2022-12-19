package task03.task030203;
import java.util.Scanner;

public class Solution {
    private static boolean yes;
    private static boolean no;
    private static boolean ravno;

    public static void main (String[] args) {
        // мой код тута
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        Scanner s2 = new Scanner (System.in);
        int a = s.nextInt();
        int b = s1.nextInt();
        int c = s2.nextInt();
        boolean yes = (a == b);
        boolean no = (b == c);
        boolean ravno = (c == a);

    }
}
