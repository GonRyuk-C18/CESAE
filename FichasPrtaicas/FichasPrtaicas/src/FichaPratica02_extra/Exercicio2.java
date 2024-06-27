package FichaPratica02_extra;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i=1; i<=255; i++)
        {
        if (i%3==0)
        {
            System.out.println(i);
        }
        }
    }
}
