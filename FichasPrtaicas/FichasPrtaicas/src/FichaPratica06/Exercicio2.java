package FichaPratica06;

import java.util.Scanner;

public class Exercicio2 {
    public static int le_Positivo() {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Introduza um numero posistivo:");
            numero = sc.nextInt();

        }while (numero<=0);
        return numero;

    }

    public static void linha_Asteriscos (int quantidade_Asteriscos) {
        for (int i=0; i<quantidade_Asteriscos; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int numero_user = le_Positivo();
        linha_Asteriscos(numero_user);
    }
}
