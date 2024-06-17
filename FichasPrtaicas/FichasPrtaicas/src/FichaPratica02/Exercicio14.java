package FichaPratica02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite um numero:");
        num1 = input.nextInt();
        System.out.println("Digite um numero:");
        num2 = input.nextInt();
        System.out.println("Digite um numero:");
        num3 = input.nextInt();

        if (num1 > num2){
            if (num2 > num3){
                System.out.println(" Ordem crescente: " + num3 + " " + num2 + " " + num1);
            }
            else {
                if (num1 > num3){
                System.out.println(" Ordem crescente: " + num2 + " " + num3 + " " + num1);
            }
                else {
                    System.out.println(" Ordem crescente: " + num2 + " " + num1 + " " + num3);
                }
                }
        }
        else {
            if (num1 > num3){
                System.out.println(" Ordem crescente: " + num3 + " " + num1 + " " + num2);
            }
            else {

                if (num2 > num3){
                    System.out.println(" Ordem crescente: " + num1 + " " + num3 + " " + num2);
                }
                else {
                    System.out.println(" Ordem crescente: " + num1 + " " + num2 + " " + num3);
                }
            }
        }
    }
}
