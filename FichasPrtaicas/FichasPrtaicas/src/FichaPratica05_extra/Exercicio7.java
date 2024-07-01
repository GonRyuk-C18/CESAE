package FichaPratica05_extra;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int remover;
        int [] array2 = new int[0];

        System.out.println("Digite o tamanho do array: ");
        x = input.nextInt();

        int [] array= new int[x];

        for(int i=0; i< array.length; i++){
            System.out.println("Digite valor array["+i+"]");
            array[i] = input.nextInt();
        }

        System.out.println("Valor a remover: ");
        remover = input.nextInt();

        for(int i=0; i< array.length; i++){
            if(array[i] == remover){

            }
        }
    }
}
