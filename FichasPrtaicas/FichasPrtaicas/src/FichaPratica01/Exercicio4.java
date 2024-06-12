package FichaPratica01;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        double raio, pi=3.14, area;

        System.out.println("Area da Circunferencia");
        System.out.println("Qual o Raio?");
        raio = imput.nextDouble();
        area = pi * (raio * raio);

        System.out.println("Area: " + area);

    }
}
