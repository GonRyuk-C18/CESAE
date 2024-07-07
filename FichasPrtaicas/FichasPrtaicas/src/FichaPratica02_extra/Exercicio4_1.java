package FichaPratica02_extra;

import java.util.Scanner;

public class Exercicio4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,i=1;


        //for (int i=1; i<=4; i++);
        while (i<=5)
        {
            System.out.println();
            for (x=1; x<=i; x++)
            {
                System.out.print("*");
            }

            i++;

        }

    }
}
