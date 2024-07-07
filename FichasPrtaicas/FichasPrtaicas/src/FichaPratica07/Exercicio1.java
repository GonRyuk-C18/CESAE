package FichaPratica07;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio1 {
    // usingScanner *  nome da função
    // String path  *  caminho que vem do main FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio_01.txt
    // FileNotFound *  exeption
    // scannerFicherio * variavel
    // new Scanner * scanner comand
    // new File(path) * orientado a objectos - aprender mais para a frente - ler o ficherio no path indicado
    public static void usingScanner(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        // enquanto variavel "ScannerFicheiro" tem String, quando encontra um "enter" salta
        while (scannerFicheiro.hasNext()) {
            //grava na variavel criada "linha Atual" a proxima Linha
            String linhaAtual = scannerFicheiro.nextLine();
            System.out.println(linhaAtual);
            // imprime o que está gravado na "Linha Atual"
        }
    }


    public static void main(String[] args) throws FileNotFoundException{
    // invoca a a função, para o path indicado
        usingScanner("FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio_01.txt");
    }
}
