package FichaPratica04;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String selecionou;

        do {

            System.out.println(" ");
            System.out.println("Escolha uma opção do Menu:");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.print("Digite aqui:");

            selecionou = input.next();


            if (selecionou.equals("1")) {
                System.out.println("Criar");
            }
            else if (selecionou.equals("2")) {
                System.out.println("Atualizar");
            }
            else if (selecionou.equals("3")) {
                System.out.println("Eliminar");
            }
            else if (selecionou.equals("4")) {
                System.out.println("Sair");
            } else {
                System.out.println("Operação Invalida!!");
            }
        }while (!selecionou.equals("4"));

    }
}
