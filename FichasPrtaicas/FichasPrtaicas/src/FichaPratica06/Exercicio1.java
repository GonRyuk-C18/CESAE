package FichaPratica06;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Exercicio1 {

        public static String fazer_Barulho (String animal)
        {

            switch (animal)
            {
                case "gato":
                    return "Miau";
                case "cão":
                    return "Au au au";
                case "peixe":
                    return "Glub Glub";
                case "porco":
                    return "oinc oinc";
                case "vaca":
                    return "Muuu";
                default:
                    return "Faz tu!!";

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


