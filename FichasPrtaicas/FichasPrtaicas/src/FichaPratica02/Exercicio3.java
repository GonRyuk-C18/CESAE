package FichaPratica02;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salario;
        double taxa;

        System.out.println("Introduza o valor do salario anual:");
        salario = input.nextInt();


        if (salario <= 15000){
            taxa = salario * 0.20;
            System.out.println("Valor a pagar de impostos: " + taxa);
        }
        if (salario > 15000 && salario <= 20000) {
            taxa = salario * 0.30;
            System.out.println("Valor a pagar de impostos: " + taxa);
        }
        if (salario > 20000 && salario <= 25000) {
            taxa = salario * 0.35;
            System.out.println("Valor a pagar de impostos: " + taxa);
        }
        if (salario > 25000){
            taxa = salario * 0.40;
            System.out.println("Valor a pagar de impostos: " + taxa);
        }

    }
}

