package FichaPratica02_extra;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i=1; i<=10; i++)
        {
            System.out.println("Tabuada do " + i);
            for (int num=1; num<=10; num++)
            {
                System.out.println(i + "x" + num + "=" + (i*num));
            }
        }
    }
}
