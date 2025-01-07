public class FilaDinamica {

    private No primeiro;
    private No ultimo;
    private int contador;

    public FilaDinamica(){
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void enqueue(int elemento) {
        No novo = new No(elemento);

        if (primeiro == null) { // lista vazia
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
        contador++;
    }

    public void dequeue() {
                primeiro = primeiro.proximo;
                contador--;
    }

    public int front(){
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia.");
        }
        return primeiro.dado;
    }


    public  boolean isEmpty(){
        if (primeiro == null){
            return true;
        }else {
            return false;
        }
    }

    public int buscar(int posicao) {
        No aux = primeiro;
        for (int i = 0; i < posicao; i++) {
            aux = aux.proximo;
        }
        return aux.dado;
    }

    public int tamanho() {
        return contador;
    }

    public void exibir() {
        No aux = primeiro;
        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }

    public boolean contains(int elemento) {
        No aux = primeiro;
        while (aux != null) {
            if (aux.dado == elemento) {
                return true;
            }
            aux = aux.proximo;
        }
        return false;
    }

    public int indexOf(int elemento) {
        No aux = primeiro;
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
