package FichaPratica06;

import java.util.Scanner;

public class Exercicio7_função {

    public static void imprimirMoldura (String caracter, int linhas, int colunas )
    {
        for (int i=0; i<colunas; i++)
        {
            System.out.print(caracter);
        }
        System.out.println();

        for (int linhAtual=0; linhAtual<linhas-2; linhAtual++)
        {
            System.out.print(caracter);
            for (int colunAtual=0; colunAtual<colunas -2; colunAtual++)
            {
                System.out.print(" ");
            }
            System.out.println(caracter);
        }

        for (int i=0; i<colunas; i++)
        {
            System.out.print(caracter);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String caracter;
        int linhas, colunas;

        System.out.println("caractere: ");
        caracter= input.next();
        System.out.println("Numero de linhas");
        linhas= input.nextInt();
        System.out.println("Numero de colunas");
        colunas= input.nextInt();

        imprimirMoldura(caracter,linhas,colunas);
    }

}
