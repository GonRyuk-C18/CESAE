package FichaPratica03;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, salto, inicio=0;

        System.out.print("Introduza um limite: ");
        limite= input.nextInt();
        System.out.print("Introduza um saldo: ");
        salto = input.nextInt();

        while (inicio<limite)
        {
            System.out.println("- " + inicio);
            inicio=inicio+salto;
        }



    }
}
