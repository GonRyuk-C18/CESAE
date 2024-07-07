package FichaPratica02_extra;

import java.util.Scanner;

public class Exercicio4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int espacos, asteriscos, z=1;

        for (int x=35; x>0; x--) {
            for (espacos = x; espacos > 1; espacos--) {

                System.out.print(" ");
            }
                for (asteriscos = z; asteriscos > 0; asteriscos--) {
                    System.out.print("*");


            }
            System.out.println();
                z+=2;
        }




    }
}
