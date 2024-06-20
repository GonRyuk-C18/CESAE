package FichaPratica03;

import java.util.Scanner;

public class Exercico2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero=1;

        while (numero<=400)
        {
            if(numero%2==0)
            {
                System.out.println("- " + numero);
                numero++;
            }
            else
            {
                numero++;
            }
        }
    }
}
