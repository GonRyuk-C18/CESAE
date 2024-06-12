package FichaPratica02;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota1, nota2, nota3;
        double mediaPonderada;

        System.out.println("Insira a nota1:");
        nota1 = input.nextInt();

        System.out.println("Insira a nota2:");
        nota2 = input.nextInt();

        System.out.println("Insira a nota3:");
        nota3 = input.nextInt();

        mediaPonderada = ((nota1 * 0.25)  + (nota2 * 0.35) + (nota3 * 0.50));
        System.out.println("Media Ponderada: " + mediaPonderada);

        if (mediaPonderada >= 9.5) {
        System.out.println(" Aprovado");
         }
        else {
            System.out.println("Reprovado");
        }




    }
}
