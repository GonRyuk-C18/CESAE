package FichaPratica02;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String selecionou;

        System.out.println("Escolha uma opção do Menu:");
        System.out.println( "1. Criar" );
        System.out.println( "2. Atualizar" );
        System.out.println( "3. Eliminar" );
        System.out.println( "4. Sair" );
        System.out.print( "Digite aqui:" );

        selecionou = input.next();


        if (selecionou.equals("Criar") || selecionou.equals("criar") || selecionou.equals("1")){
            System.out.println("Criar"); }
        if (selecionou.equals("Atualizar") || selecionou.equals("atualizar") || selecionou.equals("2")){
            System.out.println("Atualizar"); }
        if (selecionou.equals("Eliminar") || selecionou.equals("eliminar") || selecionou.equals("3")){
            System.out.println("Eliminar");}


        // switch (selecionou){
          //  case "1": System.out.println("Criar");
           //     break;
           // case "2": System.out.println("Atualizar");
           //     break;
           // case "3": System.out.println("Eliminar");
           //     break;
           // case "4":
           //     break;

        //}








    }
}
