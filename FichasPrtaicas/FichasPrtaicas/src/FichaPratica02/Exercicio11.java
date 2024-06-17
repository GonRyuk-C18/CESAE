package FichaPratica02;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo, transacao, total;

        System.out.println("introduzir o saldo da conta:");
        saldo = input.nextDouble();
        System.out.println("introduzir transacao da conta:");
        transacao = input.nextDouble();

        total = saldo + transacao;

        if (total < 0)
        {
            System.out.println("Operação invalida. Saldo Insuficiente.");
            System.out.println("Saldo disponivel: " + saldo);
        }
        else {
            saldo=total;
            System.out.println("Saldo disponivel: " + saldo);

        }
        }



        }



