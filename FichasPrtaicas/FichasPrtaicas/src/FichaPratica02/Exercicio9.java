package FichaPratica02;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2 , numero3, menor;

        System.out.println("Insira numero 1:");
        numero1 = input.nextInt();
        System.out.println("Insira numero 2:");
        numero2 = input.nextInt();
        System.out.println("insira numero 3:");
        numero3 = input.nextInt();

       if (numero1 == numero2) {
           menor = numero1;
            if (menor == numero3) {
               System.out.println("Os numeros são iguais");
           }
                else if (menor > numero3) {
               menor = numero3;
               System.out.println("Menor : " + menor);
           }
                else {
               System.out.println("Menor : " + menor);
           }
       }
       else if (numero1 == numero3){
               menor = numero1;
               if (menor > numero2) {
                   menor = numero2;
                   System.out.println("Menor : " + menor);
               }
               else {
                   System.out.println("Menor : " + menor);
               }

           }
       //else {
       //    menor = numero1;//   System.out.println("Menor : " + menor);
       //}

       }




    }

