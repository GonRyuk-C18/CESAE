package FichaPratica06;

import java.util.Scanner;

public class Exercicio3 {
    /**
     * Método que retorna se um número é par ou impar
     * @param num
     * @return true para par e false para impar
     */
    static boolean par_impar (int num)
    {
        Scanner input = new Scanner(System.in);

        if(num%2==0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Método que retorna se um numero é positivo ou negativo
     * @param num
     * @return true para positivo e false para negativo
     */
    static boolean positivo_negativo (int num)
    {
        if(num<0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Metodo que retorna se um numero é primo
     * @param num
     * @return true para primo e false para não primo
     */
    static boolean primo (int num)
    {
        for (int i = 2; i < num; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que retorna se um numero é perfeito
     * @param num
     * @return true para perfeito e false para não perfeito
     */
    static boolean perfeito (int num)
    {
        int soma=0;

        for (int i = 1; i < num; i++)
        {
            if(num%i==0)
            {
                soma=soma+i;
            }
        }
        if (soma==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Metodo para ver se numero Triangular
     * @param num
     * @return true para triangular e false para não triangular
     */
    static boolean triangular (int num)
    {
        int soma=0;

        for (int i=0; i<num; i++)
        {
            soma=soma+i;
            if (soma==num)
            {
                return true;
            }

            }
        return false;
        }
    }


