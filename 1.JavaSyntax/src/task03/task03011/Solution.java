package task03.task03011;

import java.util.Scanner;

public class Solution {
    public static void main(String [] args) {
        String MilitaryCommissar = ", Явитесь в военкомат";
        Scanner s = new Scanner (System.in);
        String nme = s.nextLine();
        Scanner ss = new Scanner (System.in);
        int age = ss.nextInt();
        if (age >= 18) {
            if (age <= 28) {
                System.out.println(nme + MilitaryCommissar);
            }
        }

    }

}
