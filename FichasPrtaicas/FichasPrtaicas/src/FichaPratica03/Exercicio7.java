package FichaPratica03;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero=1, somatorio=0;


        while (numero<=100)
        {
            System.out.println("- " + numero);
            numero++;
            somatorio= somatorio+numero;
        }
        System.out.println("Somatorio: " + somatorio);
    }
}
