package FichaPratica02_extra;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,negativo=0, positivo=0;

        do {
            System.out.println("Insert number: ");
            numero = input.nextInt();

            if (numero<0)
            {
                negativo++;
            }
            if (numero>0) {
                positivo++;
            }


        }while (numero!=0);

        System.out.println("Quantidade Negativos: " + negativo);
        System.out.println("Quantidade Positivos: " + positivo);
    }
}
