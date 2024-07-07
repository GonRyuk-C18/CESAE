package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio4 {

    public static void LerCSV (String path) throws FileNotFoundException {

        Scanner ficheiroLido = new Scanner (new File(path));

        while (ficheiroLido.hasNextLine())
        {
            String linhaAtual = ficheiroLido.nextLine();
            System.out.println(linhaAtual);
           // String[] linhaAtualSeparada= linhaAtual.split(",");
            //for (int i=0; i<linhaAtualSeparada.length; i++)
            //{
              //  System.out.println(linhaAtualSeparada[i]);
            //}
        }


    }

    public static void main(String[] args) throws FileNotFoundException {


        LerCSV("FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio_08.csv");

    }

}
