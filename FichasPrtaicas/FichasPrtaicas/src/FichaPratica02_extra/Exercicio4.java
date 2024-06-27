package FichaPratica02_extra;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,i=1;


        //for (int i=1; i<=4; i++);
        while (i<=4)
        {
            for (x=1; x<=10; x++)
            {
                System.out.print("*");
                if (x==10)
                {
                    System.out.println("");
                }
            }
            x=1;
            i++;

        }

    }
}
