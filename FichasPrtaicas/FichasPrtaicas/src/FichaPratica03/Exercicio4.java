package FichaPratica03;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numerox, numeroy=0;

        System.out.println("Insira um numero inteiro:");
        numerox = input.nextInt();


        while (numeroy <= numerox)
        {
            System.out.println("- " + numeroy);
            numeroy++;
        }
    }
}
