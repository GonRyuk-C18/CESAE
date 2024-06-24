package FichaPratica01_extra;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jackpot=23, numero=0;

        // jogo com while, um passo á frente
        while (numero!=jackpot)
        {
            System.out.print("Advinhe o numero: ");
            numero = input.nextInt();

            if (numero>23)
            {
                System.out.println("Muito alto");
            }
            else {
                System.out.println(" Muito baixo");
            }

        }
        System.out.println("Boa!! Ganhaste o jogo!!");


    }
}
