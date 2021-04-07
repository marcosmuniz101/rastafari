public class App {

    public static void main(String[] args) {

        /** Instancia contador como uma nova instância do objeto Contador. */
        Contador contador = new Contador();

        /** Cria três Threads e nomei-as */
        Tarefa t1 = new Tarefa(contador);
        t1.setName("Tarefa1");
        Tarefa t2 = new Tarefa(contador);
        t2.setName("Tarefa2");
        Tarefa t3 = new Tarefa(contador);
        t3.setName("Tarefa3");

        /** inicia a execução paralela das três Threads. */       
        t1.start();  
        t2.start();
        t3.start();
    }        
}