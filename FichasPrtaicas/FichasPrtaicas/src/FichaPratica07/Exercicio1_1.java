package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio1_1 {

    public static void lerFicheiro(String path) throws FileNotFoundException
    {

        File file = new File(path);
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }


    }

    public static void main(String[] args) throws FileNotFoundException {

        lerFicheiro("FichasPrtaicas/FichasPrtaicas/Files/FichaPratica07/exercicio_01.txt");

    }

}
