package FichaPratica06;

public class Exercicio5 {

    /**
     * Metodo para ver qual o maior dentro do vetor
     * @param vetor
     * retorna maior numero do vetor
     */
    static int vetorMaior (int[]vetor)
    {
        int vetormais;
        vetormais=vetor[0];
        for (int i=0;i< vetor.length; i++)
        {
            if (vetormais<vetor[i])
            {
                vetormais=vetor[i];
            }
        }
        return vetormais;
    }

    /**
     * Metodo para ver qual o maior dentro do vetor
     * @param vetor
     * retorna maior numero do vetor
    */
    static int vetorMenor (int[]vetor)
    {
        int vetormenos;
        vetormenos=vetor[0];
        for (int i=0;i< vetor.length; i++)
        {

            if (vetormenos>vetor[i])
            {
                vetormenos=vetor[i];
            }
        }
        return vetormenos;
    }

    static boolean vetorCrescente(int[]vetor)
    {
        for (int i=1; i<vetor.length; i++)
        {
            if (vetor[i-1]>vetor[i]) {
                return false;
            }
        }
        return true;
    }

}
