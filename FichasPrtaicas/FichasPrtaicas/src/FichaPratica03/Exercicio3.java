package FichaPratica03;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero=531, impar;

        while (numero<=750)
        {
            impar=numero%2;
            // não divisel por 2
            if (impar!=0)
            {
                System.out.println("- " + numero);
            }
            numero++;
        }
    }
}
