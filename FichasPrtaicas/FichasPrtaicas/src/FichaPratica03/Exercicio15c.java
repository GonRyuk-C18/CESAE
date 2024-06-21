package FichaPratica03;

import java.util.Scanner;

public class Exercicio15c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, contador, total=0, totalanterior=0;


        System.out.println("Digite um numero positivo: ");
        numero = input.nextInt();


        while (numero>0) {
            contador=numero-1;
            while (contador > 0)
            {
                    total = total + numero;
                    contador--;
                    System.out.println(total);
            }
            totalanterior=total;
            numero--;
        }
        System.out.println("Resultado: "+ total);
    }

}
