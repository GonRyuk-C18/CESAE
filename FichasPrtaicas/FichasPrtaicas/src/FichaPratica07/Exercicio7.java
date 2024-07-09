package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio7 {
    // conta enters/não conta enters
    // 11 ou 6 linhas
   // 258palavras ou 253palavras

    public static int contarLinhasFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        int numeroLinhas = 0;

        while (scannerFicheiro.hasNextLine()){
            numeroLinhas++;
            scannerFicheiro.nextLine();
        }

        return numeroLinhas;
    }

}
