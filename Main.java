//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArvoreBusca arvore = new ArvoreBusca();

        arvore.inserir(7);
        arvore.inserir(5);
        arvore.inserir(12);
        arvore.inserir(2);
        arvore.inserir(6);
        arvore.inserir(9);
        arvore.inserir(21);
        arvore.inserir(19);
        arvore.inserir(25);

        arvore.exibirPreOrdem();
        arvore.exibirEmOrdem();
        arvore.exibirPosOrdem();

        System.out.println(arvore.pesquisar(9));
        System.out.println(arvore.pesquisar(10));

        arvore.remover(9);

        System.out.println(arvore.pesquisar(9));
}}