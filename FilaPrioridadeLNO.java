

public class FilaPrioridadeLNO {

    private NoPrioridade primeiro;
    private NoPrioridade ultimo;
    private int contador;

    public FilaPrioridadeLNO(){
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void enqueue(int elemento,int prioridade) {
        NoPrioridade novo = new NoPrioridade(elemento,prioridade);

        if (primeiro == null) { // lista vazia
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        }
        contador++;
    }

    public NoPrioridade PesquisarPrioridade(int prioridade){
        NoPrioridade aux = primeiro;
        while (aux != null && aux.prioridade != prioridade){
            aux = aux.proximo;
        }
        return aux;
}

    public void dequeue() {
        NoPrioridade aux = null;
        int i =0;

        while(aux == null){
            aux = PesquisarPrioridade(i);
            i++;
        }

        if(aux != primeiro) {
            aux.anterior.proximo = aux.proximo;
        } else {
            primeiro = primeiro.proximo;
        }
        if (aux != ultimo) {
            aux.proximo.anterior = aux.anterior;
        }else {
            ultimo = ultimo.anterior;
        }
        contador--;

    }


    public int buscar(int posicao) {
        NoPrioridade aux = primeiro;
        for (int i = 0; i < posicao; i++) {
            aux = aux.proximo;
        }
        return aux.dado;
    }

    public int tamanho() {
        return contador;
    }

    public void exibir() {
        NoPrioridade aux = primeiro;
        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }

    public boolean contains(int elemento) {
        NoPrioridade aux = primeiro;
        while (aux != null) {
            if (aux.dado == elemento) {
                return true;
            }
            aux = aux.proximo;
        }
        return false;
    }

    public int indexOf(int elemento) {
        NoPrioridade aux = primeiro;
        int index = 0;
        while (aux != null) {
            if (aux.dado == elemento) {
                return index;
            }
            aux = aux.proximo;
            index++;
        }
        return -1;
    }

    public void limpar() {
        primeiro = null;
        ultimo = null;
        contador = 0;
    }
}
