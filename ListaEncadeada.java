abstract class ListaEncadeada {
    Node primeiro;

    public ListaEncadeada(){
        this.primeiro = null; //INICIALIZA A LISTA VAZIA
    }

    public boolean vazia(){
        return primeiro == null;
    }

    public void inserir(int valor){
        if(vazia()){ //INSERE NA PRIMEIRA POSICAO CASO LISTA VAZIA
            primeiro = new Node(valor);
        }
        else{
            Node atual = primeiro; //COMECA NO PRIMEIRO
            while(atual.getProximo() != null){ //ITERA ATE CHEGAR NO ULTIMO
                atual = atual.getProximo();
            }
            atual.setProximo(new Node(valor)); //ADICIONA VALOR NO FINAL
        }
        System.out.println("Valor Inserido: " + valor);
    }

    public void imprimir(){
        if(vazia()){
            System.out.println("Lista Vazia");
            return;
        }

        Node atual = primeiro;
        System.out.print(atual.getValor());
        while(atual.getProximo() != null){
            atual = atual.getProximo();
            System.out.print(" -> " + atual.getValor());
        }
        System.out.println();
    }

    abstract void remover();
}
