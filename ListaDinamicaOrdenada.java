public class ListaDinamicaOrdenada {
    private No primeiro;
    private No ultimo;
    private int contador;

    public ListaDinamicaOrdenada(){
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void add(int elemento) {
        No novo = new No(elemento);

        if (primeiro == null) { // lista vazia
            primeiro = novo;
            ultimo = novo;
        }
        else if(novo.dado< primeiro.dado){//primeira posição
            novo.proximo = primeiro;
            primeiro = novo;
        }
        else if(novo.dado>= ultimo.dado){// ultima posição
            ultimo.proximo = novo;
            ultimo=novo;
        }

        else {//posição intermediaria
            No aux = primeiro;
            while (novo.dado > aux.proximo.dado) {
                aux = aux.proximo;
            }
            novo.proximo=aux.proximo;
            aux.proximo=novo;
        }
        contador++;
    }



    public void remover() {
        if (contador == 0) return; // Lista vazia, nada a remover

        if (contador == 1) { // Caso onde há apenas um elemento
            primeiro = null;
            ultimo = null;
        } else {
            No aux = primeiro;
            while (aux.proximo != ultimo) {
                aux = aux.proximo;
            }
            aux.proximo = null;
            ultimo = aux;
        }
        contador--;
    }

    public void remover(int posicao) {
        if (posicao == 0) { // Remove do início
            primeiro = primeiro.proximo;
            if (contador == 1) { // Se era o único elemento
                ultimo = null;
            }
        } else {
            No aux = primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                aux = aux.proximo;
            }
            aux.proximo = aux.proximo.proximo;
            if (posicao == contador - 1) { // Se está removendo o último elemento
                ultimo = aux;
            }
        }
        contador--;
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