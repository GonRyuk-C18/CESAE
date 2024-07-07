package FichaPratica02_extra;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int x, y, total=1;

        System.out.println("Introduza o numero base: ");
        x= input.nextInt();
        System.out.println("Introduza elevação: ");
        y= input.nextInt();

        for (int i=0; i<y; i++)
        {
            total=total*x;
        }

        System.out.println("Resultado = "+ total);
    }
}
