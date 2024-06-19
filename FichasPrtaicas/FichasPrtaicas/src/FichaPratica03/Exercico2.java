package FichaPratica03;

import java.util.Scanner;

public class Exercico2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero=2;

        while (numero<=400)
        {
            System.out.println("- " + numero);
            numero = numero+2;
        }
    }
}
