/** Classe Contador. */
public class Contador {

    /** Variável tipo inteiro "cont". Privada, logo só pode ser manipulada dento da classe Contador */
    private int cont = 0;

    /** Método responsável por incrementar a variável cont. 
     * 
     * Onde aplicamos o atributo synchronized para que a execução das Threads seja sincronizada.
    */
    public synchronized int increment(){

        /** Estrutura de repetição For apenas para que o processo demore mais tempo em execulsão. */
        for(int i = 30; i <= 30; ++i){}

        /** Incrementando a variável cont. */
        int n = cont;
        cont = n + 1;

        /** Imprimindo o Contador após ser incrementado. */
        System.out.println("Cont: " + cont);
        
        /** Retorno do método increment, retorna a variavél cont. */
        return cont;
    }    
}
