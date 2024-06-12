package FichaPratica01;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigoFuncionario, diasTrabalhados;
        double resultado, retencao, segurancaSocial, subAlimentacao;

        System.out.println("Insira o codigo de Funcionário:");
        codigoFuncionario = input.nextInt();

        System.out.println("numero de dias trabalhados:");
        diasTrabalhados = input.nextInt();

        resultado = diasTrabalhados * 40;
        System.out.println("trabalhador: " + codigoFuncionario);
        System.out.println("valor bruto: "+resultado + "€");;

        subAlimentacao = diasTrabalhados * 5;
        System.out.println("Subsidio de alimentação: " + subAlimentacao + "€");

        retencao = resultado * 0.10;
        System.out.println("Retenção IRS: " + retencao + "€");;

        segurancaSocial = resultado * 0.3475;
        System.out.println("Segurança Social: " + segurancaSocial + "€");

        resultado = (diasTrabalhados * 40) - retencao - segurancaSocial;
        System.out.println("Resultado: " + resultado + "€");









    }
}
