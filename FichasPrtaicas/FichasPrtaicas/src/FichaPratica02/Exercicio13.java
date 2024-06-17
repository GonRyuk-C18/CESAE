package FichaPratica02;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos;
        String dia;

        System.out.println("Digite as Horas:");
        horas = input.nextInt();
        System.out.println("Digite os Minutos:");
        minutos = input.nextInt();

        if (horas > 12){
            dia = "PM";
        }
        else {
            dia = "AM";
        }


       switch (horas){
           case 13 : horas = 1;
           break;
           case 14 : horas = 2;
           break;
           case 15 : horas = 3;
           break;
           case 16 : horas = 4;
           break;
           case 17: horas = 5;
           break;
           case 18 : horas = 6;
           break;
           case 19 : horas = 7;
           break;
           case 20 : horas = 8;
           break;
           case 21 : horas = 9;
           break;
           case 22 : horas = 10;
           break;
           case 23 : horas = 11;
           break;
           case 24: horas = 12;
        }

        System.out.println(" Resultado: " + horas + " " + minutos + " " + dia);

    }
}
