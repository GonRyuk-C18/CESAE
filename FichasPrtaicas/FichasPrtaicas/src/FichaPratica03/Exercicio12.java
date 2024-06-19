package FichaPratica03;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero=0, contador1=0, contador2=0, contador3=0, contador4=0;

        while (numero>=0)
        {
            System.out.print("Introduza um numero:");
            numero = input.nextInt();

            if (numero<=25 && numero>0)
            {
                contador1++;
            }
            if (numero<=50 && numero>25)
            {
                contador2++;
            }
            if (numero<=75 && numero>50)
            {
                contador3++;
            }
            if (numero<=100 && numero>75)
            {
                contador4++;
            }
        }
        System.out.println("[00,25]: " + contador1);
        System.out.println("[26,50]: " + contador2);
        System.out.println("[51,75]: " + contador3);
        System.out.println("[76,100]: " + contador4);
    }
}
