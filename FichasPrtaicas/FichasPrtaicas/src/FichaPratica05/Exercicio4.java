package FichaPratica05;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++)
        {
            System.out.print("Digite um valor: ");
            vetor[i] = input.nextInt();
        }

        for (int i=0; i<vetor.length; i++)
        {
            if (vetor[0]>vetor[i])
            {
                vetor[0] = vetor[i];
            }
        }
        System.out.println("O maior dos valores introduzidos: " + vetor[0]);
    }
}
