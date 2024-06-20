package FichaPratica03;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fim, inicio=0;

        System.out.println("Insira um numero inteiro:");
        fim = input.nextInt();


        while (inicio <= fim)
        {
            System.out.println("- " + inicio);
            inicio++;
        }
    }
}
