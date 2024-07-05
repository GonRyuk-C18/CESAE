package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio5 {

    public static void LerTexto(String path) throws FileNotFoundException {
        int soma=0;
        Scanner ficheiroLido = new Scanner(new File(path));

        while (ficheiroLido.hasNext())
        {
            String linhAtual = ficheiroLido.nextLine();
            System.out.println(linhAtual);
            String[] linhaAtualSperada = linhAtual.split(" ");

       // for (int i=0; i<; i++)
       // System.out.println(linhaAtualSperada[i]);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        LerTexto("FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio_05_31.txt");
    }
}
