package FichaPratica03;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, anterior, seguinte;
        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        seguinte= numero+5;
        anterior= numero-5;

        while (anterior<numero)
        {
            System.out.println("- " + anterior);
            anterior++;
        }
        System.out.println(" ");
        while (numero<seguinte)
        {
            numero++;
            System.out.println("- " + numero);

        }
    }
}
