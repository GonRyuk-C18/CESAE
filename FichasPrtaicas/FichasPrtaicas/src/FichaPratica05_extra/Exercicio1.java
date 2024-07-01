package FichaPratica05_extra;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int[14];

        for (int i=0; i<array.length;i++)
        {
            System.out.println(" Introduza o valor "+array[i]+" : ");
            array[i] = input.nextInt();
        }

        for (int i=0; i< array.length; i++)
        {
            System.out.print(" > "+array[i]+" ");
        }
    }
}
