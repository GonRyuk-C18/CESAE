package FichaPratica02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1, valor2;
        String operacao;

        System.out.println("Calculadora entre 2 numeros: ");
        System.out.println("valor1:");
        valor1 = input.nextDouble();
        System.out.println("valor2:");
        valor2 = input.nextDouble();
        System.out.println("Operacao: ");
        operacao = input.next();

        switch (operacao) {
            case "+":
                System.out.println(" Resultado: " +  (valor1+valor2));
                break;
            case "-":
                System.out.println(" Resultado: " +  (valor1-valor2));
                break;
            case "x":
                System.out.println(" Resultado: " +  (valor1*valor2));
                break;
                case "*" :
                    System.out.println(" Resultado: " +  (valor1*valor2));
                    break;
            case "/":
                System.out.println(" Resultado: " +  (valor1/valor2));
                break;
            default:
                System.out.println(" Sem operação valida a realizar");



        }

    }
}
