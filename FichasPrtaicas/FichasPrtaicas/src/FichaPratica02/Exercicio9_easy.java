package FichaPratica02;

import java.util.Scanner;

public class Exercicio9_easy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.println("Digite um numero 1: ");
        numero1 = input.nextInt();
        System.out.println("Digite um numero 2: ");
        numero2 = input.nextInt();
        System.out.println("Digite um numero 3: ");
        numero3 = input.nextInt();

        if (numero1 < numero2){
            if (numero1 < numero3){
                System.out.println("Numero menor: " + numero1);
            }
            else {
                System.out.println("Numero maior: " + numero3);
            }
        }
        else if (numero2 < numero3){
            System.out.println("Numero menor: " + numero2);
        }
        else {
            System.out.println("Numero maior: " + numero3);
        }
    }
}
