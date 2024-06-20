package FichaPratica03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, x=0;
        String mensagem;


        System.out.println("Introduza um numero: ");
        numero = input.nextInt();
        System.out.println("Introduza uma mensagem: ");
        //limpeza dbuffer apenas se tivermos lido algo antes.
        input.nextLine();
        mensagem = input.next();

        while (x < numero)
        {
            System.out.println(mensagem);
            x++;
        }

    }
}
