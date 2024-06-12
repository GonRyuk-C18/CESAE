package FichaPratica02;

import java.util.Scanner;

public class Exercico2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, taxa;

        System.out.println("Introudizir salario: ");
        salario = input.nextDouble();



        if (salario <= 15000) {
            taxa = salario * 0.20;
            System.out.println("Paga taxa: " + taxa + "€");
        }
            else {
            taxa = salario * 0.30;
            System.out.println("Paga taxa: " + taxa + "€");
        }

    }
}
