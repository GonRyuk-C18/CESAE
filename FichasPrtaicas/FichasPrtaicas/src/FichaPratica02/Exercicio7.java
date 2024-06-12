package FichaPratica02;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //numero par divisivel por 2 com resto 0
        //numero impar divisivel por 2 sem resto 0

        int numero;

        System.out.println("introduza o numero:");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("numero par");

        }
        else{
            System.out.println("numero impar");
        }
    }
}
