package FichaPratica02_extra;

public class Exercicio5_1 {
    public static void main(String[] args) {

        int numero=1, z=1;

        for (int x=9;x>0;x--)
        {
            for (int y=x;y>0;y--) {
                System.out.print(" ");
            }
                for (int i=z;i>0;i--)
                {
                    System.out.print(numero);
                }


            System.out.println();
            numero+=1;
            z+=2;
        }

    }
}
