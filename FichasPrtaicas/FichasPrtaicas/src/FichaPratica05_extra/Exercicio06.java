package FichaPratica05_extra;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;

        System.out.println("Digite um valor: ");
        x = input.nextInt();

        int [] array= new int[x];

        for(int i=0; i< array.length; i++){
            System.out.println("Digite valor array["+i+"]");
            array[i] = input.nextInt();
        }

        for (int i=0;i< array.length;i++)
        {
            System.out.print(" > " + array[i]+" ");
        }

    }
}
