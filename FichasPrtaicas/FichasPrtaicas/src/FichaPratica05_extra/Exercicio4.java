package FichaPratica05_extra;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array= new int[10];
        int pesquisa;

        for (int i = 0; i < array.length; i++) {

            System.out.println("Digite um numero array["+i+"] : " );
            array[i] = input.nextInt();

        }
        System.out.print("Numero a pesquisar: ");
        pesquisa = input.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (pesquisa==array[i])
            {
                System.out.println(" > Array["+i+"]");
            }

        }

    }
}
