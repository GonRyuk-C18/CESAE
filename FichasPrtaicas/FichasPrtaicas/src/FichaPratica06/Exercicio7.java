package FichaPratica06;


import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int linhas, colunas;
        String caracter;

        System.out.println("Caractere");
        caracter= input.next();
        System.out.println("Numero de linhas");
        linhas= input.nextInt();
        System.out.println("Numero de colunas");
        colunas= input.nextInt();
        int [][] matriz = new int[linhas][colunas];

        for (int i=0; i< matriz.length; i++)
        {
            if (i==0 || i==(matriz.length-1)) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(caracter);
                }
                System.out.println();
            }
            else
            {
                for (int j = 0; j < matriz[0].length; j++)
                {
                    if (j==0 || j==(matriz[0].length-1))
                    {
                        System.out.print(caracter);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        }





    }


}
