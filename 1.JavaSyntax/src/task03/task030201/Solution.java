package task03.task030201;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        {
            if (age < 18)
            {
                if (age >= 6)
                    System.out.println("Нужно ходить в школу");
            }
            else
                System.out.println("Пора в институт");
        }
        }

    }
