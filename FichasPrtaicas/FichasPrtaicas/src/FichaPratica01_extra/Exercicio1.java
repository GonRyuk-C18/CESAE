package FichaPratica01_extra;

import java.util.Scanner;

public class Exercicio1     {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("introduza a idade:");
        idade = input.nextInt();

        if (idade<18)
        {
            System.out.println("Menor de idade");
        }
        else
        {
            System.out.println("Maior de idade");
        }
    }
}
