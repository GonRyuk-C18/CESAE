package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class exercicio3 {
    // funçao para criarFicheiro atravez de uma string mensagem
    public static void criarFicheiro(String mensagem) throws FileNotFoundException {
    // Ficheiro tipo file vai ser criado no path
        File Ficheiro = new File("FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio3P.txt");
        // Printwriter "maquina de escrever" vai escrever na variavel ficheiro que por sua vez vai guardar no path
        PrintWriter maquinadeEscrever = new PrintWriter(Ficheiro);
        maquinadeEscrever.println(mensagem);
        maquinadeEscrever.close();
    }

    public static String lerFicheiro(String path) throws FileNotFoundException {
    // Scanner de ficheiro no path indicado vai ser guardado na variavel FicheiroLido
        Scanner ficheiroLido = new Scanner(new File(path));
        // criação de String ConteudoTotal para guardar a totalidade dos Strings lidos no ciclo while
        String conteudoTotal = "";
    // enquanto ficheiroLido tem um linha seguinte, String Linhatual guarda o que está na linha atual que por sua vez "soma" ao que ja está na variavel ConteudoTotal
        while (ficheiroLido.hasNext()) {
            String linhAtual = ficheiroLido.nextLine();
            conteudoTotal += linhAtual + "\n";
        }
        // dá como retorno o conteudoTotal
        return conteudoTotal;
    }


    public static void main(String[] args) throws FileNotFoundException {
        //lerFicheiro("FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio_01.txt");
        // cria o ficheiro usando como varivel String o retorno da função LerFicheiro no path indicado
        criarFicheiro(lerFicheiro("FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio_01.txt"));
    }


}
