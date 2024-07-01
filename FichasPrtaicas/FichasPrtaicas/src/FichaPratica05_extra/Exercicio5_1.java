package FichaPratica05_extra;

import java.util.Scanner;

public class Exercicio5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int[10];
        int [] array2 = new int[10];


        for (int i = 0; i < array.length; i++) {
            System.out.print(" Digite o valor para o array["+i+"] :");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    for (int k = 0; k < array2.length; k++) {
                        if (array2[k] == array[i]) {
                            array2[k] = array[i];
                        }
                    }

                }
            }
        }
        System.out.print("numeros Repetidos: ");
        for (int k = 0; k < array2.length; k++) {
            System.out.print(array2[k]+" ");
        }

    }
}
