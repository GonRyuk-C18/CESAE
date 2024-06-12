package FichaPratica01;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        double produto1, produto2, produto3, DESCONTO=0.90, total;

        System.out.println("Valor produto 1: ");
        produto1 = imput.nextDouble();
        System.out.println("Valor produto 2: ");
        produto2 = imput.nextDouble();
        System.out.println("Valor produto 3: ");
        produto3 = imput.nextDouble();

        total = (produto1 + produto2 + produto3) * DESCONTO;

        System.out.println("total a pagar com desconto. " + total);



    }
}
