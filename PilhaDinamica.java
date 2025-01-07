

public class PilhaDinamica {

    private NoPilhas topo;
    private int cont;

    public PilhaDinamica() {
        topo = null;
        cont= 0;
    }

    public void push(int elemento) {
        NoPilhas novo = new NoPilhas(elemento);
        if(topo == null) {
            topo=novo;
        }else {
            novo.proximo = topo;
            topo = novo;
        }
        cont++;
    }

    public boolean isEmpty() {
        return (topo== null);
    }

    public int  pop() {
        NoPilhas aux = topo;
        topo=topo.proximo;
        cont--;
        return aux.dado;
    }

    public int top() {
        return topo.dado;
    }

    public void exibir() {
        NoPilhas atual = topo;

        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }

        System.out.println();
    }



}
