package FichaPratica05;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][5];
        int valor, count=0;

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                System.out.println("Insira um numero na Matriz["+i+"]["+j+"] :");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("Insira um numero para pesquisar: ");
        valor = input.nextInt();

        for (int i=0; i<matriz.length; i++)
        {
            System.out.print(" > ");
            for (int j=0; j<matriz[0].length; j++)
            {
                System.out.print(matriz[i][j] + "   ");
                if (valor == matriz[i][j])
                {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("Há " + count + " posições na matriz com o numero " + valor);
    }

}
