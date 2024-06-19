package FichaPratica03;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero=0, media=0, x=0;

        while (numero!=-1)
        {
            System.out.println("Introduza um número:");
            numero = input.nextInt();
            if (numero!=-1) {
                x++;
                media = (media + numero);
            }

        }
        media=media/x;

        System.out.println("Media: " + media);
    }
}
