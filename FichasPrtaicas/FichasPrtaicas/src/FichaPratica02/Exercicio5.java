package FichaPratica02;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Intoduza o valor1:");
        valor1 = input.nextInt();

        System.out.println("Intoduza o valor2:");
        valor2 = input.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor2 + "\t" + valor1);
        }
        else {
            System.out.println(valor1 + "\t" + valor2);
        }
    }
}
