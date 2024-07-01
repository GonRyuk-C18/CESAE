package FichaPratica05_extra;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[] = new int[10];
        int procura;
        boolean encontrado= false  ;

        for (int i = 0; i < array.length; i++) {

            System.out.println("Digite valor " + i + ": ");
            array[i] = input.nextInt();

        }


            System.out.println("Digite sua procura: ");
            procura = input.nextInt();

            for (int i = 0; i < array.length; i++) {
                if (array[i] == procura) {
                    encontrado = true;
                }
            }

            if (encontrado)
            {
                System.out.println("Encontrado!");
            }
            else
            {
                System.out.println(" Não encontrado!!");
            }

    }
}
