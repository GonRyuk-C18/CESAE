package FichaPratica05;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int [] valor = new int[12];
        String [] meses = new String []{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho","Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int total=0;

        for (int i = 0; i < valor.length; i++)
        {
            System.out.println("Insira valor de mes "+meses[i]+" :");
            valor[i] = input.nextInt();
            total += total + valor[i];
        }
        //for (int i = 0; i < valor.length; i++)
        //{
        //   total = total+valor[i];
        //}
        System.out.println("Total: " + total);

    }
}
