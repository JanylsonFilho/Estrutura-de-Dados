public class NoPrioridade {

    public int dado;
    public int prioridade;
    public NoPrioridade proximo;
    public NoPrioridade anterior;

    public NoPrioridade(int elemento,int prioridade){
        dado=elemento;
        this.prioridade = prioridade;
        proximo = null;
        anterior=null;
    }


}
