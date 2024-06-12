package FichaPratica01;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        double num1, num2, num3;
        double mediaAritmetica, mediaPonderada;

        System.out.println("insira o 1º valor:");
        num1 = imput.nextDouble();
        System.out.println("insira o 2º valor:");
        num2 = imput.nextDouble();
        System.out.println("insira o 3º valor:");
        num3 = imput.nextDouble();

        mediaAritmetica = (num1 + num2 + num3) / 3 ;
        mediaPonderada = ((num1 * 0.20) + (num2 * 0.3) + (num3 * 0.5));

        System.out.println("Media Aritmética: " + mediaAritmetica);
        System.out.println("Media Ponderada: " + mediaPonderada);







    }
}
