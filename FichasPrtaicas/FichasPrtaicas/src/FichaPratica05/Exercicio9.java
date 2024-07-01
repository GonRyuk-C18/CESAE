package FichaPratica05;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] valor =  new int[5][5];
        int total=0;

        for (int i = 0; i < valor.length; i++)
        {
            for (int j = 0; j < valor[0].length; j++)
            {
                System.out.println("Digite um valor: ");
                valor[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                total= total+valor[i][j];
            }
        }

        System.out.println(" Total: "+ total);
    }
}
