package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio2 {

    // Nome função: criarFicheiroMensagem
    // variavel de entrada Tipo String
    // variavel nome: mensagem
    // exepction do FileWriter, basta passar o rato pelo error para fazer add exeption
    public static void criarFicheiroMensagem (String mensagem) throws IOException {

        // cria variavel tipo File , grava novo File no destino (path)
        File Mensagem = new File ("FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio2P.txt");
        // FileWriter invocado, criada variavel do tipo filewriter com nome "Maquina de escrever" que vai escreve o conteudo na variavel Mensagem que por sua vez vai criar o Ficheiro
        FileWriter MaquinaDeEscrever = new FileWriter(Mensagem);
        // println em FileWriter é append -  imprime dados gravados na String mensagem
        MaquinaDeEscrever.append(mensagem);
        // fecha o fileWriter
        MaquinaDeEscrever.close();



    }

    public static void main(String[] args) throws IOException {

        String mensagem;
        // guarda String na variavel mensagem
        mensagem ="a Vida é Programar";
        // invoca função e passa a varivel mensagem como input para a função
        criarFicheiroMensagem(mensagem);
    }

}
