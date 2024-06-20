package FichaPratica03;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.print("Insira um numero inteiro para iniciar: ");
        inicio = input.nextInt();
        System.out.print("Insira um numero inteiro para terminar: ");
        fim = input.nextInt();

        System.out.println("- " + inicio);
        while (inicio<=fim)
        {
            if (inicio%5==0) {
                System.out.println("- " + inicio);
                inicio++;
            }
            else
            {
                inicio++;
            }
        }
        if (fim%5!=0) {
            System.out.println("- " + fim);
        }


        

    }
}
