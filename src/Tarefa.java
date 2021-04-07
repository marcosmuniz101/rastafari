/** Classe Tarefa que extende classe Thread nativa do JAVA. */
public class Tarefa extends Thread {    

    /** Declaração do objeto contardor do tipo Contador. */
    private Contador contardor;

    /** Construtor Classe Tarefa passando como parâmetro o objeto contardor. */
    public Tarefa(Contador contardor){
        this.contardor = contardor; 
    }

    /** Método run que se faz necessário quando se extende a classe Thread, é executado a cada Thread criada. */
    public void run(){

        /** Estrutura de repetição For apenas para que o processo demore mais tempo em execulsão. */
        for(int i = 10; i <= 10; ++i){}

        /** Chamando o método increment da classe Contador */
        contardor.increment();

        /** Pint movido para dentro do método increment da classe contador */
        //System.out.println("Cont: " + cont.increment());
    }
}
