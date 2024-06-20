package FichaPratica03;

import java.util.Scanner;

public class Exercicio15b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, fatorial=1, x=0, total=0, numeroinicial, vezes=1;


        System.out.println("Digite um numero positivo: ");
        numero = input.nextInt();
        numeroinicial=numero;
        //total = (5+(4+4+4+4)+(3+3+3)+(2+2)+(1))

        if (numero > 0) {
            while (numero > 0)
            {
                x=0;
                while (vezes>0)
                {// tem de somar o numero o numero de vezes
                    x = x+numero;
                    vezes--;
                }
                fatorial = fatorial+x;
                numero--;
                vezes=numero-1;
            }
            System.out.println("fatorial de " + numeroinicial + " = " + total);
        }
        else
        {
            System.out.println("Numero Negativo!!");
        }

    }
}
