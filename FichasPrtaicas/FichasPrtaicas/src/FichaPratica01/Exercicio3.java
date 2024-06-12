package FichaPratica01;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int cumprimeto, largura, area, perimetro;

        System.out.println("Area e Perimetro do retangulo");
        System.out.println("cumprimento:");
        cumprimeto = imput.nextInt();
        System.out.println("largura:");
        largura = imput.nextInt();

        perimetro = 2 * (cumprimeto + largura) ;
        area = cumprimeto * largura;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: "+ area);




    }
}
