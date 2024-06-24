package FichaPratica01_extra;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letra;

        System.out.print("Introduza uma letra: ");
        letra= input.nextLine();

        switch (letra)
        {
            case "A":
                System.out.println("Vogal");
                break;
            case "E":
                System.out.println("Vogal");
                break;
            case "I":
                System.out.println("Vogal");
                break;
            case "O":
                System.out.println("Vogal");
                break;
            case "U":
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
                break;
        }

    }
}
