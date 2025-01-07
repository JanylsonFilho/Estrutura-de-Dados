public class MainPilhas {
    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();
        System.out.println(pilha.isEmpty());
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);
        pilha.push(7);
        pilha.push(8);
        pilha.exibir();
        System.out.println(pilha.isEmpty());
        pilha.pop();
        pilha.exibir();
        pilha.pop();
        pilha.exibir();
        System.out.println(pilha.top());
    }
}
