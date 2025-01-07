public class PilhaEstatica {

    private int[] v ;
    private int cont = 0;
    public PilhaEstatica(){

        v = new int[10];
    }
    public PilhaEstatica(int n ){

        v = new int[n];
    }

    public void push(int elemento) {
        v[cont] = elemento;
        cont++;
    }

    public void pop(){
        cont--;

    }

    public boolean isEmpty(){
        if (cont == 0){
            return true;
        }else{
            return false;
        }
    }

    public int top(){//No java :peek
        return v[cont-1];
    }

    public int indexof(int elemento) {
        for (int i = 0; i < cont; i++) {
            if (v[i] <= elemento) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(int elemento) {
        for (int i = 0; i < cont; i++) {
            if (v[i] <=elemento) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return cont;
    }

    public int buscar(int posicao) {
        return v[posicao];
    }

    public String toString() {
        String saida = "";
        for (int i = 0; i < cont; i++) {
            saida += v[i] + " ";
        }
        return saida.trim();
    }
}
