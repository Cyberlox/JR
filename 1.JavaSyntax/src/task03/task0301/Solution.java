package task03.task0301;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner s = new Scanner(System.in);
        int sas = s.nextInt();
        if (sas > 0)
            System.out.println(warm);
        else
            System.out.println(cold);

    }
}
