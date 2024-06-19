package FichaPratica03;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Introduza um numero de inicio:");
        a = input.nextInt();
        System.out.print("Introduza um numero de fim:");
        b = input.nextInt();

        while (a<=b)
        {
            System.out.println(a);
            a++;
        }
    }
}
