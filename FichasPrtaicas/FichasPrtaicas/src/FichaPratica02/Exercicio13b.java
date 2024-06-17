package FichaPratica02;

import java.util.Scanner;

public class Exercicio13b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos;
        String dia;

        System.out.println("Digite as Horas:");
        horas = input.nextInt();
        System.out.println("Digite os Minutos:");
        minutos = input.nextInt();

        if (horas == 12) {
            if (minutos > 0)
                System.out.println("Resultado: " + horas + " " + minutos + "PM");
        } else {

            if (horas > 12) {
                horas = horas / 2;
                if (minutos > 0)
                    System.out.println("Resultado: " + horas + " " + minutos + "PM");
            } else {
                System.out.println("Resultado: " + horas + " " + minutos + "AM");
            }
        }
    }
}
