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

           if (numero%2==0 || numero%3==0 ||numero%5==0 ||numero%7==0) {
              if( numero/2==1 && numero%2==0)
              {
                  System.out.println("Primo");
              } else if (numero/3==1 && numero%3==0)
              {
                  System.out.println("Primo");
              } else if (numero/5==1 && numero%5==0)
              {
                  System.out.println("Primo");
              }
              else if (numero/7==1 && numero%7==0)
              {
                  System.out.println("Primo");
              }
              else if (numero/8==1 && numero%8==0)
              {
                  System.out.println("Primo");
              }else if (numero/9==1 && numero%9==0)
              {
                  System.out.println("Primo");
              }else if (numero/11==1 && numero%11==0)
              {
                  System.out.println("Primo");
              }else
              {
                  System.out.println("Não primo");
              }
           }
           else
           {
               System.out.println("Primo");
           }
       }while (count==1);
    }
}
