package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio6 {

    public static void pessoaMaisVelha(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File (path));

        int maiorIdade = 0;
        String pessoaMaisvelha = " ";

        while (scannerFicheiro.hasNextLine()) {
            String linha = scannerFicheiro.nextLine();

            String[] linhaDividida = linha.split(",");

            if(Integer.parseInt(linhaDividida[1])>maiorIdade){ // Estamos perante uma pessoa mais velha
                maiorIdade=Integer.parseInt(linhaDividida[1]);
                pessoaMaisvelha=linhaDividida[0];
            }
        }
        System.out.println("A pessoa "+pessoaMaisvelha+" é a mais velha com "+maiorIdade+" anos.");



    }

    public static void main(String[] args) throws FileNotFoundException {
        pessoaMaisVelha("FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio_06.txt");
    }






    }
