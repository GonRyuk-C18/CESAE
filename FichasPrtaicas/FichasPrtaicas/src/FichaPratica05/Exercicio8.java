package FichaPratica05;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] valor= new int[3][3];

        for (int i = 0; i < 3; i++)
        {
         for (int j = 0; j < 3; j++)
         {
             System.out.println("Intoduza um valor: ");
             valor[i][j] = input.nextInt();
         }
        }
        for (int i = 0; i < 3; i++)
        {
            System.out.println();
            for (int j = 0; j < 3; j++)
            {
                System.out.print(valor[i][j]);
            }
        }
    }
}
