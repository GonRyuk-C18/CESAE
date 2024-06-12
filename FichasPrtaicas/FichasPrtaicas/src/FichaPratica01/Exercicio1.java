package FichaPratica01;


import javax.xml.transform.Source;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        //import Scanner - uso sempre que for para ser introduzido imput de utilizador
        Scanner imput = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("insira um numero:");
        num1 = imput.nextInt();
        System.out.println("insira um numero:");
        num2 = imput.nextInt();

        soma = num1 + num2;

        System.out.println("Soma:" + soma);
    }
}
