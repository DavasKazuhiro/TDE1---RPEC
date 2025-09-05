public class PilhaListaEncadeada extends ListaEncadeada{
    private Node ultimo;
    public PilhaListaEncadeada(){
        super();
        this.ultimo = null;
    }

    public void remover(){
        if(vazia()){
            System.out.println("Não foi possivel remover (LISTA VAZIA)");
            return;
        }

        Node atual = primeiro; //COMECA NO PRIMEIRO
        Node anterior = null;

        while(atual.getProximo() != null){ //ITERA ATE CHEGAR NO ULTIMO
            anterior = atual; //ARMAZENA O PENULTIMO
            atual = atual.getProximo();
        }

        System.out.println("Valor removido: " + atual.getValor());
        if(anterior != null){
            anterior.setProximo(null); //FAZ O PENULTIMO NAO TER PROXIMO
        }
        else{
            primeiro = null;
        }
    }
}
