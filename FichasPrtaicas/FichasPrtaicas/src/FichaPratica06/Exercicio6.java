package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Exercicio5.*;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int x, opcao, maior, menor;

        System.out.println("********* Analise de um Vetor ***********");
        System.out.println("Qual o tamanho do vetor:");
        x= input.nextInt();


        int[] vetor= new int[x];
        for (int i=0; i<x;i++) {
            System.out.print("Introduza o numero " + (i+1)+":");
            vetor[i]= input.nextInt();
        }
        System.out.println("Escolha uma opção :");
        System.out.println("7. Maior Elemento");
        System.out.println("8. Menor Elemento");
        System.out.println("9. Crescente ou Não Crescente");
        System.out.println("10. Sair");

        do {
            System.out.println("Escolha a opção:");
            opcao= input.nextInt();

            switch (opcao)
            {

                case 7:
                    maior = vetorMaior(vetor);
                    System.out.println("O maior numero é: " + maior);
                    break;
                case 8:
                    menor = vetorMenor(vetor);
                    System.out.println("O menor numero é: " + menor);
                    break;
                case 9:
                    if (vetorCrescente(vetor)){
                        System.out.println("Crescente");
                    }
                    else {
                        System.out.println("Não crescente");
                    }
                    break;
                default:
                    System.out.println("Opção invalida!!");

            }
        }while (opcao!=10);

    }
}
