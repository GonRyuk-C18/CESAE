package FichaPratica04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int numero, count=1;
//não esta a dar
        //pedir numero
       do {
           System.out.println("Digite um numero: ");

           numero = input.nextInt();

           if (numero/2!=1 || numero%2!=0) {
               System.out.println("não primo");
           }
           else
           {
               System.out.println("Primo");
           }
       }while (count==1);
    }
}
