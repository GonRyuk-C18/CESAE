package FichaPratica01;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Introduzir valor1:");
        valor1 = imput.nextInt();
        System.out.println("Introduzir valor2:");
        valor2 = imput.nextInt();


        valor2 = valor2 + valor1;
        valor1 = valor2 - valor1;
        valor2 = valor2 - valor1;



        System.out.println("valor1: " + valor1);
        System.out.println("valor2: " + valor2);


    }
}
