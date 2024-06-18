package FichaPratica02;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        String ordem;


        System.out.println("Digite um numero:");
        num1 = input.nextInt();
        System.out.println("Digite um numero:");
        num2 = input.nextInt();
        System.out.println("Digite um numero:");
        num3 = input.nextInt();
        System.out.println("Indique a ordem:");
        System.out.println("C. Crescente");
        System.out.println("D. Decrescente");
        ordem = input.next();

        switch (ordem){
            case "C":
                if (num1 > num2 && num1 > num3){
                    if (num2 > num3){
                        System.out.println(num3 + " " + num2 + " " + num1);
                    }
                    else {
                        System.out.println(num2 + " " + num3 + " " + num1);
                    }
                }
                if (num2 > num1 && num2 > num3){
                    if (num1 > num3){
                        System.out.println(num3 + " " + num1 + " " + num2);
                    }
                    else{
                        System.out.println(num1 + " " + num3 + " " + num2);
                    }
                }
                if (num3 > num1 && num3 > num2){
                    if (num1>num2){
                        System.out.println(num2 + " " + num1 + " " + num3);
                    }
                    else {
                        System.out.println(num1 + " " + num2 + " " + num3)
                        ;
                    }
                }
                break;
                case "D":
                    if (num1 > num2 && num1 > num3){
                        if (num2 > num3){
                            System.out.println(num1 + " " + num2 + " " + num3);
                        }
                        else {
                            System.out.println(num1 + " " + num3 + " " + num2);
                        }
                    }
                    if (num2 > num1 && num2 > num3){
                        if (num1 > num3){
                            System.out.println(num2 + " " + num1 + " " + num3);
                        }
                        else{
                            System.out.println(num2 + " " + num3 + " " + num1);
                        }
                    }
                    if (num3 > num1 && num3 > num2){
                        if (num1>num2){
                            System.out.println(num3 + " " + num1 + " " + num2);
                        }
                        else {
                            System.out.println(num3 + " " + num2 + " " + num1)
                            ;
                        }
                    }
        }

        



        


    }
}
