package FichaPratica03;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, fatorial=1, slot;

        System.out.println("Digite um numero positivo: ");
        numero = input.nextInt();
        slot=numero;

        if (numero > 0) {
            while (numero > 0)
            {
                fatorial = fatorial*numero;
                numero--;
            }
            System.out.println("fatorial de " + slot + " = " + fatorial);
        }
        else
        {
            System.out.println("Numero Negativo!!");
        }
    }
}
