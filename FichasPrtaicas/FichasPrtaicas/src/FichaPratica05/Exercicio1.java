package FichaPratica05;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vector =new int[10];

        for (int i = 0; i < vector.length; i++)
        {
            System.out.println("introduza um numero no Array [" + i + "]:");
            vector[i] = input.nextInt();
        }
        System.out.println(" ");

        // quando variavel criada dentro de um ciclo ela so existe dentro daquele ciclo pelo que pode ser recriada noutro ciclo
        for (int i = 0; i < vector.length; i++)
        {
            System.out.println(" > " + vector[i]);
        }

    }
}
