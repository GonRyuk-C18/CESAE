package FichaPratica02_extra;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero=1;

        for (int x=1; x<=5; x++)
        {
            for (int y=x; y>0;y--)
            {
                System.out.print(numero);
            }
            System.out.println();
            numero+=1;

        }




   }
}
