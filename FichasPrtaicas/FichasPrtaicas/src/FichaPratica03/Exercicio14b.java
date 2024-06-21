package FichaPratica03;

import java.util.Scanner;

public class Exercicio14b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade, numero, numeroanterior=0;
        boolean crescente= true;

        System.out.println("Quantas vezes?");
        quantidade = input.nextInt();

        while (quantidade > 0) {
            System.out.println("Numero:");
            numero = input.nextInt();

            if (numeroanterior < numero)
            {
                numeroanterior = numero;
            }
            else
            {
                crescente = false;
            }


            quantidade--;
        }
        if (crescente)
        {
            System.out.println("Crescente");
        }
        else
        {
            System.out.println("Nao crescente");
        }
    }
}
