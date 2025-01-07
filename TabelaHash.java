public class TabelaHash {
    No[] vector;

    TabelaHash(int tamanho) {
        vector = new No[tamanho];
    }

    public void add(int value) {
        int position = value % vector.length;
        No newNode = new No(value);
        if (vector[position] == null) {
            vector[position] = newNode;
        } else {
            No aux = vector[position];
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();

        for (int i = 0; i < vector.length; i++) {
            msg.append(i).append(" -> ");
            if (vector[i] == null) {
                msg.append("\\").append("\n");
            } else {
                No aux = vector[i];
                while (aux != null) {
                    msg.append(aux.dado);
                    aux = aux.proximo;
                    if (aux != null) {
                        msg.append(" -> ");
                    }
                }
                msg.append(" -> \\\n");
            }
        }

        return msg.toString();
    }
}