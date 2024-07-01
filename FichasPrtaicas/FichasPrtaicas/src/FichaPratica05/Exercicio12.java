package FichaPratica05;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array_1 = new int[3];
        int [] array_2 = new int[3];
        int [][] matriz = new int [3][2];

        for (int i = 0; i < array_1.length; i++) {
            System.out.println("Insira um valor array1: ");
            array_1[i] = input.nextInt();
            System.out.println("array 1  "+ array_1[i]);
        }
        for (int i = 0; i < array_2.length; i++) {
            System.out.println("Insira um valor array2: ");
            array_2[i] = input.nextInt();
            System.out.println("array 2  "+ array_2[i]);
        }

        for (int i = 0; i < matriz.length ; i++)
        {
            for (int j = 0; j < matriz[0].length ; j++)
            {
                if (j==0) {
                    matriz[i][j] = array_1[i];
                }
                if (j==1) {
                    matriz[i][j] = array_2[i];
                }
            }
        }
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }



    }
}
