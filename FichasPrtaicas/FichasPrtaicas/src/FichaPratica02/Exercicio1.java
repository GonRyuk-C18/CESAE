package FichaPratica02;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Introduza um numero:");
        numero1 = input.nextInt();

        System.out.println("introduza um numero:");
        numero2 = input.nextInt();

        if (numero1 > numero2)
            System.out.println( " Maior: " + numero1);
        else
            System.out.println( " Maior: " + numero2);



    }
}
