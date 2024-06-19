package FichaPratica02;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo, credito;

        System.out.println("Digite o valor de saldo medio:");
        saldo = input.nextDouble();

        if (saldo>=0 && saldo<=2000)
        {
            credito= 0;
            System.out.println("Saldo Medio: " + saldo + " Valor de Credito: Nenhum");
        }
        if (saldo>2000 && saldo<=4000)
        {
            credito= saldo*0.20;
            System.out.println("Saldo Medio: " + saldo + " Valor de Credito: " + credito);
        }
        if (saldo>4000 && saldo<=6000)
        {
            credito= saldo*0.30;
            System.out.println("Saldo Medio: " + saldo + " Valor de Credito: " + credito);
        }
        if (saldo>6000)
        {
            credito= saldo*0.40;
            System.out.println("Saldo Medio: " + saldo + " Valor de Credito: " + credito);
        }

    }
}
