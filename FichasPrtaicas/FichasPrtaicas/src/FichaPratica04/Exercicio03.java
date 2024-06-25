package FichaPratica04;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //jogador 1 valor 0-100
        //jogador2 tenta acertar valor
        //cada count se maior ou menor
        //quando acerta apresentar count

        int jackpot, numero, count=0;

        System.out.println("Jogador 1: ");
        System.out.println("Digite um numero: ");
        jackpot = sc.nextInt();

        for (numero =0; numero != jackpot; count++)
        {
            System.out.println("Jogador 2: ");
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            if (numero<jackpot)
            {
                System.out.println("valor inferior ao jackpot)");
            }
            else
            {
                System.out.println("valor superior ao jackpot");
            }

        }
        System.out.println(count);
    }
}
