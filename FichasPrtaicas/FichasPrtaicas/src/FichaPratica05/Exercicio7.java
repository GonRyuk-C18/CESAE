package FichaPratica05;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] valor = new int[5];
        int par=1;


        for (int i = 0; i < valor.length; i++)
        {
            System.out.println("Digite um valor: ");
            valor[i] = input.nextInt();

            par=valor[0];
            if (valor[i]%2==0)
            {
                if (par%2!=0) {
                    par = valor[i];
                }
                else {
                    if (valor[i]>par)
                    {
                        par=valor[i];
                    }
            }

            }
        }
        if (par%2!=0)
        {
            System.out.println("Não existe nenhum par!");
        }
        else
        {
            System.out.println("Maior par: " + par);
        }




    }
}
