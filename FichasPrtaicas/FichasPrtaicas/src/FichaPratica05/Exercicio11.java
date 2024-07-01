package FichaPratica05;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][3];
        int maior=0, menor=0;

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.println("Insira o valor : ");
                matriz[i][j] = input.nextInt();

            }
        }
        maior=matriz[0][0];
        menor=matriz[0][0];


        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                if (maior < matriz[i][j])
                {
                    maior = matriz[i][j];
                }
                if (menor > matriz[i][j])
                {
                    menor = matriz[i][j];
                }
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("Maior : " + maior);
        System.out.println("Menor : " + menor);


    }
}
