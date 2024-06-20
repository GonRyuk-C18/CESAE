package FichaPratica02;

import java.util.Scanner;

public class Exercicio16b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, notas;

        System.out.println("Digite um valor: ");
        valor  = input.nextInt();

        notas=valor/200;
        valor=valor%200;
        System.out.println("Notas de 200: " + notas);

        notas=valor/100;
        valor=valor%100;
        System.out.println("Notas de 100: " + notas);

        notas=valor/50;
        valor=valor%50;
        System.out.println("Notas de 50: " + notas);

        notas=valor/20;
        valor=valor%20;
        System.out.println("Notas de 20: " + notas);

        notas=valor/10;
        valor=valor%10;
        System.out.println("Notas de 10: " + notas);

        notas=valor/5;
        valor=valor%5;
        System.out.println("Notas de 5: " + notas);




    }
}
