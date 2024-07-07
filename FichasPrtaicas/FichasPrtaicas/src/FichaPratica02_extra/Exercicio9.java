package FichaPratica02_extra;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, mil=0, cem=0, dez=0, um=0;

        System.out.println("Introduza o numero: ");
        x= input.nextInt();

        while(x>1000){
           x=x-1000;
           mil++;}

        while(x>100){
            x=x-100;
            cem++;
        }

        while(x>10){
            x=x-10;
            dez++;
        }

        while(x>0){
            x=x-1;
            um++;
        }

        x=mil+cem+dez+um;
        System.out.println("Total: " +x);
    }


}
