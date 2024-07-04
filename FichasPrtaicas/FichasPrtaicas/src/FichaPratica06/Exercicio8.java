package FichaPratica06;

import java.util.Scanner;

public class Exercicio8 {

    public static void somarMatrizes(int[][]matriz1,int[][]matriz2) {

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                System.out.print(matriz1[linha][coluna] + matriz2[linha][coluna] + "\t|\t");
            }
            System.out.println();
            }



    }
    public static int somatorioMatrizes(int[][]matriz1,int[][]matriz2)
    {
        int somatorio=0;

        for (int linha=0; linha<matriz1.length; linha++)
        {
            for (int coluna=0; coluna<matriz1[0].length; coluna++)
            {
                somatorio=somatorio+matriz1[linha][coluna];
                somatorio=somatorio+matriz2[linha][coluna];
            }
        }
        return somatorio;

    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][]matriz1= new int[3][3];
        int[][]matriz2= new int[3][3];
        int somatorio;

        for (int linha=0;linha<matriz1.length;linha++)
        {
            for (int coluna=0; coluna<matriz1[0].length; coluna++) {
                System.out.println("Introduza o valor para matiriz["+linha+"]["+coluna+"]");
                matriz1[linha][coluna]= input.nextInt();
            }
        }
        for (int linha=0;linha<matriz2.length;linha++)
        {
            for (int coluna=0; coluna<matriz2[0].length; coluna++) {
                System.out.println("Introduza o valor para matiriz["+linha+"]["+coluna+"]");
                matriz2[linha][coluna]= input.nextInt();
            }
        }

        somarMatrizes(matriz1, matriz2);

        somatorio= somatorioMatrizes(matriz1, matriz2);
        System.out.println("Somatorio de matrizes: "+ somatorio);


    }




}
