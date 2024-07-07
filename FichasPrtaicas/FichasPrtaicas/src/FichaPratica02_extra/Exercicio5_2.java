package FichaPratica02_extra;

public class Exercicio5_2 {

    public static void main(String[] args) {

        int numero=1, z=1;
        int acomulou=1;

        for (int x=9;x>0;x--)
        {
            for (int y=x;y>0;y--) {
                System.out.print(" ");
            }
            for (int i=z;i>0;i--)
            {
                System.out.print(numero);
                numero--;
            }
            numero+=2;
            for (int i=z;i>1;i--)
            {
                System.out.print(numero);
                numero++;
            }
            numero=acomulou;

            System.out.println();
            acomulou+=1;
            numero=acomulou;
            z+=1;
        }

    }
}
