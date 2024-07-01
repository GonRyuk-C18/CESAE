package FichaPratica05_extra;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int[10];
        boolean check= false;

        for (int i = 0; i < array.length; i++) {
            System.out.print(" Digite o valor para o array["+i+"] :");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j=(i+1); j< array.length; j++)
            {
               if (array[i]==array[j])
               {
                   for (int k=j-1; k>= array[0+i]; k--)
                   {
                       if (array[j]==array[k]) {
                           check= true;
                       }
                   }
                   if (check)
                   {
                       check= false;
                   }
                   else
                   {
                       System.out.println(array[i]+" Repetido!!");
                       check= false;
                   }

               }
            }
        }

    }
}
