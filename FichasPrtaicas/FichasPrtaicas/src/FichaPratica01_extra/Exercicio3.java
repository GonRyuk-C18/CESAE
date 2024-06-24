package FichaPratica01_extra;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco;

        System.out.print("intorduz o preço:");
        preco = input.nextDouble();

        if (preco >100)
        {
            preco = preco *0.9;
            System.out.println("Preço final: " + preco + " 10 % desconto.");
        }
        else
        {
            System.out.println("Preço final: " + preco + " Sem desconto.");
        }


    }
}
