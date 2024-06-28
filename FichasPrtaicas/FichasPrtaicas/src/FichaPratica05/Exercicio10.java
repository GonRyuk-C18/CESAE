package FichaPratica05;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][5];
        int valor, count=0;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.println("Insira um numero na Matriz["+i+"]["+j+"] :");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i=0; i<3; i++)
        {
            System.out.print(" > : ");
            for (int j=0; j<5; j++)
            {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();

        }
        System.out.println("Insira um numero para pesquisar: ");
        valor = input.nextInt();

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<5; j++)
            {
                if (valor == matriz[i][j])
                {
                    count++;
                }
            }
        }
        System.out.println("Há " + count + " posições na matriz com o numero " + valor);
    }

}
