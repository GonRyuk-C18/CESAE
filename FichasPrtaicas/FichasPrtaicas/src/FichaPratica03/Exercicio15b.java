package FichaPratica03;

import java.util.Scanner;

public class Exercicio15b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, fatorial=0, numeroinicial, x=0, y=0, total=-1, numero1;


        System.out.println("Digite um numero positivo: ");
        numero = input.nextInt();
        numeroinicial=numero;
        //total = 5*4*3*2*1
        //count = (4+4+4+4+4)=20
        //total = count
        //while (count >0)
        {
            //count2=3+3+3
            //total = total+count2
        }

        if (numero > 0) {
            numero1=numero-1;
            while (numero > 0)
            {
                if (total==-1)
                {
                    total=numero;
                    while (total>0)
                    {
                        x=x+numero1;
                        total--;
                    }
                }
                else
                {
                    total=y;
                    while (total>0)
                    {
                        x=x+numero1;
                        total--;
                    }
                }
                y=x-numero1;
                x=0;
                numero--;
                System.out.println(y);
            }
            System.out.println("fatorial de " + numeroinicial + " = " + y);
        }
        else
        {
            System.out.println("Numero Negativo!!");
        }

    }
}
