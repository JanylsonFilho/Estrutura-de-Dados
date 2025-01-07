public class FilaPrioridadeLO {
    private NoPrioridade primeiro;
    private NoPrioridade ultimo;
    private int contador;

    public FilaPrioridadeLO(){
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void enqueue(int elemento,int prioridade) {
        NoPrioridade novo = new NoPrioridade(elemento,prioridade);

        if (primeiro == null) { // lista vazia
            primeiro = novo;
            ultimo = novo;
        }
        else if(novo.prioridade< primeiro.prioridade){//primeira posição
            novo.proximo = primeiro;
            primeiro = novo;
        }
        else if(novo.prioridade>= ultimo.prioridade){// ultima posição
            ultimo.proximo = novo;
            ultimo=novo;
        }

        else {//posição intermediaria
            NoPrioridade aux = primeiro;
            while (novo.prioridade > aux.proximo.prioridade) {
                aux = aux.proximo;
            }
            novo.proximo=aux.proximo;
            aux.proximo=novo;
            novo.proximo.anterior = novo;
            novo.anterior =aux;
        }
        contador++;
    }


    public void dequeue() {
     primeiro = primeiro.proximo;
     if (primeiro != null) {
         primeiro.anterior = null;
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
