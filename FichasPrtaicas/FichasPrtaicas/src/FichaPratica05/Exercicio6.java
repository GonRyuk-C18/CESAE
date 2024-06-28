package FichaPratica05;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] vetor = new int[5];
        int cresente=0;
        boolean verdade = true;

        for (int i = 0; i < vetor.length; i++)
        {
            System.out.print("Digite um valor: ");
            vetor[i] = input.nextInt();
        }
        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i]<=vetor[i-1])
            {
                verdade = false;
            }


        }
        if (verdade)
        {
            System.out.println("Crescente");
        }
        else
        {
            System.out.println("Não crescente");
        }
    }

}
