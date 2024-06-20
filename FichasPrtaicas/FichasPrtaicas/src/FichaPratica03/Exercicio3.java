package FichaPratica03;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero=531;

        while (numero<=750)
        {
            // não divisel por 2
            if (numero%2!=0)
            {
                System.out.println("- " + numero);
                numero++;
            }
            else
            {
                numero++;
            }
        }
    }
}
