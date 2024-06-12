package FichaPratica01;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minutos1, minutos2, minutos3, minutos4, minutos5, segundos1, segundos2, segundos3, segundos4, segundos5, minutos, segundos;

        System.out.println("- Introduz minutos da musica 1: ");
        minutos1 = input.nextInt();
        System.out.println("- Introduz segundos da musica 1: ");
        segundos1 = input.nextInt();

        System.out.println("- Introduz minutos da musica 2: ");
        minutos2 = input.nextInt();
        System.out.println("- Introduz segundos da musica 2: ");
        segundos2 = input.nextInt();

        System.out.println("- Introduz minutos da musica 3: ");
        minutos3 = input.nextInt();
        System.out.println("- Introduz segundos da musica 3: ");
        segundos3 = input.nextInt();

        System.out.println("- Introduz minutos da musica 4: ");
        minutos4 = input.nextInt();
        System.out.println("- Introduz segundos da musica 4: ");
        segundos4 = input.nextInt();

        System.out.println("- Introduz minutos da musica 5: ");
        minutos5 = input.nextInt();
        System.out.println("- Introduz segundos da musica 5: ");
        segundos5 = input.nextInt();

        segundos = segundos1 + segundos2 + segundos3 + segundos4 + segundos5;
        minutos = segundos / 360;
        
        minutos1 = minutos1 + minutos2 + minutos3 + minutos4 + minutos5;





    }
}
