package FichaPratica03;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sequencia, numero=0, inicio=0;

        System.out.print("Quantos numeros deseja inserir: ");
        sequencia = input.nextInt();

        while (sequencia>0)
        {
            System.out.println("Introduza um numero: ");
            numero = input.nextInt();
            sequencia--;
            if (inicio==0)
            {
                inicio = numero;
            }
        }
        if (inicio<numero)
        {
            System.out.println("Crescente");
        }
        else
        {
            System.out.println("Decrescente");
        }

    }
}
