package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercicio2_1 {

    public static void criarFicheiroTexto(String path, String mensagem) throws FileNotFoundException {
        PrintWriter maquinaEscreve= new PrintWriter( new File(path));
        maquinaEscreve.print(mensagem);
        maquinaEscreve.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        criarFicheiroTexto("FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio2.2P.txt", "Olá tudo bem?");
    }

}
