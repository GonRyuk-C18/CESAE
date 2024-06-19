package FichaPratica03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, inicio=2;

        System.out.println("Introduz um numero maior que 2:");
        numero = input.nextInt();

        if (numero<2)
        {
            System.out.println("ERROR!!Numero inferior a 2!!");
        }
        else
        {
            while (inicio<=numero)
            {
                System.out.println("- " + inicio);
                inicio=inicio+2;
            }
        }

    }
}
