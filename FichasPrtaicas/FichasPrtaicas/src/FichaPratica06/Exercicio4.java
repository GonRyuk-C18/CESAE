package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Exercicio3.*;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, opcao;
        System.out.println("****** Analise de um Numero ******");
        System.out.print("Introduza o numero: ");
        num = input.nextInt();

        System.out.println();
        System.out.println("Escolha uma opção:");
        System.out.println("1. Par ou impar");
        System.out.println("2. Positivo ou Negativo");
        System.out.println("3. Primo ou não Primo");
        System.out.println("4. Perfeito ou não Perfeito");
        System.out.println("5. Triangular ou não triangular");
        System.out.println("6. trocar de Numero");
        System.out.println("7. Sair");


        do {
            System.out.print("Insira aqui a opção : ");
            opcao = input.nextInt();

            switch (opcao) {


                case 1:

                    if (par_impar(num)) {
                        System.out.println("Numero par!");
                    } else {
                        System.out.println("Numero Impar");
                    }
                    break;

                case 2:
                    if (positivo_negativo(num)){
                        System.out.println("Numero Positivo");
                    }
                    else
                    {
                        System.out.println("Numero Negativo");
                    }
                    break;
                case 3:
                    if (primo(num)){
                        System.out.println("Numero Primo");
                    }
                    else
                    {
                        System.out.println("Numero não Primo");
                    }
                    break;
                case 4:
                    if (perfeito(num)){
                        System.out.println("Numero Perfeito");
                    }
                    else
                    {
                        System.out.println("Numero não Perfeito");
                    }
                    break;
                case 5:
                    if (triangular(num)){
                        System.out.println("Numero Triangular");
                    }
                    else
                    {
                        System.out.println("Numero não Triangular");
                    }
                    break;
                case 6:
                    System.out.println("Novo Numero: ");
                    num = input.nextInt();
                    break;
                default:
                    System.out.println("Escolha inválida!!");

            }

        }
        while (opcao!=7);


    }
}
