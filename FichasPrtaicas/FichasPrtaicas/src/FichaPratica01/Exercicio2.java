package FichaPratica01;

import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int num1, num2, soma, sub, mult, div;

        System.out.println("introduzir numero:");
        num1 = imput.nextInt();

        System.out.println("introduzir numero:");
        num2 = imput.nextInt();

        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("soma:" + soma);
        System.out.println("subtração:" + sub);
        System.out.println("multiplicação:" + mult);
        System.out.println("divisão:" + div);


    }
}