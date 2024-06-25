package FichaPratica04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, resultado;
        String operacao, continuar;
do {

    System.out.println("introduzir numero:");
    num1 = input.nextInt();

    System.out.println("introduzir numero:");
    num2 = input.nextInt();

    System.out.println("Escolha a operação:");
    operacao = input.next();


    switch (operacao) {
        case "+":
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
            break;
        case "-":
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
            break;
        case "*":
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
            break;
        case "/":
            resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
            break;
        default:
            System.out.println("Operação invalida");
    }
    System.out.println("Deseja continuar? (S/N)");
    continuar = input.next();
}while (!continuar.equals("N"));




    }
}
