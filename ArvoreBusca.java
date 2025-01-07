public class ArvoreBusca {
    private NoArvore raiz;


    public ArvoreBusca(){
        this.raiz = null;
    }

    public void inserir(int elemento){
        if (this.raiz == null){
            this.raiz =  new NoArvore(elemento);
        }
        else {
            inserir(elemento,this.raiz);
        }

    }

    public void inserir(int elemento, NoArvore raiz){
        if (elemento < raiz.dado){
            if (raiz.esquerdo == null){
                raiz.esquerdo = new NoArvore(elemento);
            }else {
                inserir(elemento,raiz.esquerdo);
            }

        } else if( elemento > raiz.dado) {
            if (raiz.direito == null){
                raiz.direito = new NoArvore(elemento);
            }else {
                inserir(elemento,raiz.direito);
            }
        }
    }


    public boolean pesquisar(int dado) {
        if (raiz == null) {
            return false;
        }
        else {
            return pesquisar(dado, raiz);
        }
    }

    private boolean pesquisar(int dado, NoArvore raiz) {
        if (dado == raiz.dado) {
            return true;
        }
        else if (dado < raiz.dado) {
            if (raiz.esquerdo == null) {
                return false;
            }
            else {
                return pesquisar(dado, raiz.esquerdo);
            }
        }
        else if (dado > raiz.dado) {
            if (raiz.direito == null) {
                return false;
            }
            else {
                return pesquisar(dado, raiz.direito);
            }
        }

        return false;
    }

    public void remover(int dado){
        if (raiz != null){
            remover(dado,raiz,null);
        }
    }

    private void remover(int dado,NoArvore raiz,NoArvore pai){

        if (dado == raiz.dado){
            if (raiz.esquerdo == null && raiz.direito == null){ //No não tem filhos

                if (raiz == pai.esquerdo)   // No é filho esquerdo?
                        pai.esquerdo = null;
                else
                    pai.direito =null;
            }
            else if (raiz.esquerdo != null && raiz.direito ==null){ // Nó tem um filho (esquerdo)

                if (raiz == pai.esquerdo)   // No é filho esquerdo?
                    pai.esquerdo = raiz.esquerdo;
                else
                    pai.direito =raiz.esquerdo;
            }
            else if (raiz.esquerdo == null && raiz.direito !=null) { // Nó tem um filho (direito)

                if (raiz == pai.esquerdo)   // No é filho esquerdo?
                    pai.esquerdo = raiz.direito;
                else
                    pai.direito = raiz.direito;
            }

            else if (raiz.esquerdo != null && raiz.direito !=null) {// No tem dois filhos
                    raiz.dado = menorValor(raiz.direito);
                    remover(raiz.dado,raiz.direito,raiz);
            }

        }
                else if (dado<raiz.dado) {
                    if (raiz.esquerdo != null){
                        remover(dado,raiz.esquerdo,raiz);
                    }
        }
        else if (dado>raiz.dado) {
            if (raiz.direito != null){
                remover(dado,raiz.direito,raiz);
            }
        }

    }

    private int menorValor(NoArvore raiz ){
        if (raiz.esquerdo == null){
            return raiz.dado;

        }
        else
            return menorValor(raiz.esquerdo);
    }

    public void exibirPreOrdem() {
        if (raiz != null) {
            exibirPreOrdem(raiz);
            System.out.println();
        }
    }

    public void exibirPreOrdem(NoArvore raiz){
        System.out.print(raiz.dado + " ");
        if (raiz.esquerdo != null){
            exibirPreOrdem(raiz.esquerdo);
        }

        if (raiz.direito != null){
            exibirPreOrdem(raiz.direito);
        }

    }

    public void exibirEmOrdem() {
        if (raiz != null) {
            exibirEmOrdem(raiz);
            System.out.println();
        }
    }

    private void exibirEmOrdem(NoArvore raiz) {
        if (raiz.esquerdo != null) {
            exibirEmOrdem(raiz.esquerdo);
        }

        System.out.print(raiz.dado + " ");

        if (raiz.direito != null) {
            exibirEmOrdem(raiz.direito);
        }
    }

    public void exibirPosOrdem() {
        if (raiz != null) {
            exibirPosOrdem(raiz);
            System.out.println();
        }
    }

    private void exibirPosOrdem(NoArvore raiz) {
        if (raiz.esquerdo != null) {
            exibirPosOrdem(raiz.esquerdo);
        }

        if (raiz.direito != null) {
            exibirPosOrdem(raiz.direito);
        }

        System.out.print(raiz.dado + " ");
    }


}