package FichaPratica01;

import java.util.Scanner;

public class Exercicio8v1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos, segundos;

        System.out.println("- Introduz minutos da musica 1: ");
        minutos = input.nextInt();
        System.out.println("- Introduz segundos da musica 1: ");
        segundos = input.nextInt();

        System.out.println("- Introduz minutos da musica 2: ");
        minutos = minutos + input.nextInt();
        System.out.println("- Introduz segundos da musica 2: ");
        segundos = segundos + input.nextInt();

        System.out.println("- Introduz minutos da musica 3: ");
        minutos = minutos + input.nextInt();
        System.out.println("- Introduz segundos da musica 3: ");
        segundos = segundos + input.nextInt();

        System.out.println("- Introduz minutos da musica 4: ");
        minutos = minutos + input.nextInt();
        System.out.println("- Introduz segundos da musica 4: ");
        segundos = segundos + input.nextInt();

        System.out.println("- Introduz minutos da musica 5: ");
        minutos = minutos + input.nextInt();
        System.out.println("- Introduz segundos da musica 5: ");
        segundos = segundos + input.nextInt();

        minutos = minutos + (segundos / 60);
        segundos = segundos % 60;

        horas = minutos / 60;
        minutos = minutos % 60;

        System.out.printf("total do Album: " + horas + "h" + minutos + "m" + segundos + "s");
}
}
