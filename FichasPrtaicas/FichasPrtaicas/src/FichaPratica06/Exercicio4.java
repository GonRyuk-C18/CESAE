package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Exercicio3.perfeito;
import static FichaPratica06.Exercicio3.triangular;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Introduza o numero: ");
        num = input.nextInt();

       // triangular(num);

        int soma=0;

        for (int i=0; soma<=num; i++)
        {
            soma=soma+i;
            if (soma==num)
            {
                System.out.println("tiangular");
                break;
            }
            else
            {
                System.out.println("NOT");
            }

        }

       // if (perfeito(num)) {
       //     System.out.println("triangular");
      //  }
       // else {
      //      System.out.println("Não triangular");
      //  }
    }
}
