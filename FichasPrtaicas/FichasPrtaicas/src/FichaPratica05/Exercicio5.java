package FichaPratica05;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x=10;
        double [] vetor = new double[x];
        double media= 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = input.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++)
        {
            media=media+vetor[i];
        }
        System.out.println("media: "+media/x);



    }
}
