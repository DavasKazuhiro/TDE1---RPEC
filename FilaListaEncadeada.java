public class FilaListaEncadeada extends ListaEncadeada{
    Node ultimo;
    public FilaListaEncadeada(){
        super();

    }

    public void remover(){
        if(vazia()){
            System.out.println("Não foi possivel remover (LISTA VAZIA)");
            return;
        }
        if(primeiro.getProximo() == null){
            System.out.println("Valor removido: " + primeiro.getValor());
            primeiro = null;
        }
        else{
            Node segundo = primeiro.getProximo();
            System.out.println("Valor removido: " + primeiro.getValor());
            primeiro.setProximo(null);
            primeiro = segundo;
        }
    }
}
