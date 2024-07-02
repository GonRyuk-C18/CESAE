package FichaPratica06;

import java.util.Scanner;

public class Exercicio1_0 {
    public static void fazer_Barulho (String animal)
    {
        String barulho;

        switch (animal)
        {
            case "gato":
                System.out.println("Miau");
            break;
            case "cão":
                System.out.println("Au au au");
            break;
            case "peixe":
                System.out.println("Glub Glub");
            break;
            case "porco":
                System.out.println("oinc oinc");
            break;
            case "vaca":
                System.out.println("Muuu");
            break;
            default:
                System.out.println("Faz tu!!");

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String animal_Escolhido;

        System.out.println("Escolha uma animal: ");
        animal_Escolhido = input.nextLine();

        fazer_Barulho(animal_Escolhido);
    }

    }
