package FichaPratica01_extra;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double peso;

        System.out.print("Introduza o seu peso (em Kg.): ");
        peso = input.nextDouble();

        peso=peso*0.16;

        System.out.println("Peso na Lua: " + peso + "Kg");

    }
}
