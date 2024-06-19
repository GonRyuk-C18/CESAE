package FichaPratica02;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int valor, duzentos, cem, cinquenta, vinte, dez, cinco, multiplo;

        System.out.print("Digite um valor em euros: ");
        valor = input.nextInt();

        // 1100/200= duz=
        multiplo=valor%5;

        if (multiplo==0)
        {
            if (valor>=200)
            {
                duzentos=valor/200;
                valor=valor%200;
                System.out.println("Notas de 200: " + duzentos);
            }
            if (valor>=100)
            {
                cem=valor/100;
                valor=valor%100;
                System.out.println("Notas de 100: " + cem);
            }
            if(valor>=50)
            {
                cinquenta=valor/50;
                valor=valor%50;
                System.out.println("Notas de 50: " + cinquenta);
            }
            if (valor>=20)
            {
                vinte=valor/20;
                valor=valor%20;
                System.out.println("Notas de 20: " + vinte);
            }
            if (valor>=10)
            {
                dez=valor/10;
                valor=valor%10;
                System.out.println("Notas de 10: " + dez);
            }
            if (valor>=5)
            {
                cinco=valor/5;
                System.out.println("Notas de 5: " + cinco);
            }
        }
        else {
            System.out.println("Erro! Numero inserido não é multiplo de 5!");
        }


    }
}
