package FichaPratica02_extra;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int numero, maior, menor;

        System.out.println("Isert number: ");
        numero= input.nextInt();

        maior=numero;
        menor=numero;


        do {
            System.out.println("Isert number: ");
            numero= input.nextInt();
                if (numero!=0) {
                    if (maior < numero) {
                        maior = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }


        }while (numero!=0);

        System.out.println("Maior numero inserido: " + maior);
        System.out.println("Menor numero inserido: " + menor);
    }
}
