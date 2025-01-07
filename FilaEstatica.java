public class FilaEstatica {

    private int[] v ;
    private int fim = -1;
    private int inicio = 0;
    public FilaEstatica(){

        v = new int[10];
    }
    public FilaEstatica(int n ){

        v = new int[n];
    }

    public void enqueue(int elemento) { // add no final
        fim++;
        v[fim] = elemento;

    }

  public int front(){// no java :peek
        return v[inicio];
  }

    public void dequeue(){//remove do inicio
       inicio++;
    }

    /*public int dequeue(){//remove do inicio
        inicio++;
        return v[inicio-1];
    }

     */



    public boolean isEmpty(){
        return inicio>fim;
    }



    public int indexof(int elemento) {
        for (int i =inicio; i <= fim; i++) {
            if (v[i] <= elemento) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(int elemento) {
        for (int i =inicio; i <= fim; i++) {
            if (v[i] <=elemento) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return fim-inicio +1;
    }

    public int buscar(int posicao) {
        return v[posicao];
    }

    public String toString() {
        String saida = "";
        for (int i =inicio; i <= fim; i++) {
            saida += v[i] + " ";
        }
        return saida.trim();
    }
}
