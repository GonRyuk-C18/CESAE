package FichaPratica02;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigoFuncionario, diasTrabalhados;
        String cargo;
        double salario, retencao, segurancaSocial, subAlimentacao;

        System.out.println("Insira o codigo de Funcionário:");
        codigoFuncionario = input.nextInt();

        System.out.println("Selecione o cargo:");
        System.out.println("(E) para Empregado");
        System.out.println("(C) para Chefe");
        System.out.println("(A) para Admnistrador");
        cargo = input.next();

        System.out.println("numero de dias trabalhados:");
        diasTrabalhados = input.nextInt();

        switch (cargo)
        {
            case "E":
                salario = diasTrabalhados * 40;
                System.out.println("trabalhador: " + codigoFuncionario);
                System.out.println("valor bruto: "+salario + "€");;

                subAlimentacao = diasTrabalhados * 5;
                System.out.println("Subsidio de alimentação: " + subAlimentacao + "€");

                if (salario<=1000) {
                    retencao = salario * 0.10;
                    System.out.println("Retenção IRS: " + retencao + "€");
                }
                else {
                    retencao = salario * 0.20;
                    System.out.println("Retenção IRS: " + retencao + "€");
                }

                segurancaSocial = salario * 0.3475;
                System.out.println("Segurança Social: " + segurancaSocial + "€");

                salario = (diasTrabalhados * 40) - retencao - segurancaSocial;
                System.out.println("Resultado: " + salario + "€");
                break;

            case "C" :
                salario = diasTrabalhados * 60;
                System.out.println("trabalhador: " + codigoFuncionario);
                System.out.println("valor bruto: "+salario + "€");;

                subAlimentacao = diasTrabalhados * 7.50;
                System.out.println("Subsidio de alimentação: " + subAlimentacao + "€");

                if (salario<=1000) {
                    retencao = salario * 0.10;
                    System.out.println("Retenção IRS: " + retencao + "€");
                }
                else {
                    retencao = salario * 0.20;
                    System.out.println("Retenção IRS: " + retencao + "€");
                }

                segurancaSocial = salario * 0.3475;
                System.out.println("Segurança Social: " + segurancaSocial + "€");

                salario = (diasTrabalhados * 60) - retencao - segurancaSocial;
                System.out.println("Resultado: " + salario + "€");
                break;

            case "A" :
                salario = diasTrabalhados * 80;
                System.out.println("trabalhador: " + codigoFuncionario);
                System.out.println("valor bruto: "+salario + "€");;

                subAlimentacao = diasTrabalhados * 7.50;
                System.out.println("Subsidio de alimentação: " + subAlimentacao + "€");

                if (salario<=1000) {
                    retencao = salario * 0.10;
                    System.out.println("Retenção IRS: " + retencao + "€");
                }
                else {
                    retencao = salario * 0.20;
                    System.out.println("Retenção IRS: " + retencao + "€");
                }

                segurancaSocial = salario * 0.30;
                System.out.println("Segurança Social: " + segurancaSocial + "€");

                salario = (diasTrabalhados * 80) - retencao - segurancaSocial;
                System.out.println("Resultado: " + salario + "€");
                break;




        }











    }
}
