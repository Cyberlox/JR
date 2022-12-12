package task03.task03011;

import java.util.Scanner;

public class Solution {
    public static void main(String [] args) {
        String MilitaryCommissar = ", Явитесь в военкомат";
        Scanner s = new Scanner (System.in);
        String nme = s.nextLine();
        Scanner ss = new Scanner (System.in);
        int age = ss.nextInt();
        int ageTrue = 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28 ;
        if (age = ageTrue)
                System.out.println(nme+ MilitaryCommissar);
        else
            ;
        // Так я тут пытался сделать вообще другое решение, я пытался сделать два Int
        // один из них сделать рядом чисел НУ ТУТ ВИДНО)) другой сравнить с этим рядом
        // поставить != в if и если они равны, то команда работает, если нет то ничего
        // но не выходит(( как писать ряд числе в int? гугл выдаёт что-то странно с int[] {}
        // обычное решение я уже подсмотрел, там просто делается два if... не додумался до такого, думал нельзя мнм


    }

}
