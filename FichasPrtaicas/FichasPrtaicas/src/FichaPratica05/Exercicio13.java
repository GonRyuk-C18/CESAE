package FichaPratica05;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[4][4];
        int soma=0;

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.println("Insira um numero na Matriz["+i+"]["+j+"] :");
                matriz[i][j] = input.nextInt();
                if (i==j)
                {
                    soma=soma+matriz[i][j];
                }
            }
        }
        System.out.println("soma da diagonal principal: " + soma);


    }
}
