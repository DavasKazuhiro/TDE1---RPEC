public class Node {
    private int valor;
    private Node proximo;

    public Node(int v){
        this.valor = v;
        this.proximo = null;
    }

    public int getValor() {return valor;}

    public void setValor(int valor) {this.valor = valor;}

    public Node getProximo() {return proximo;}

    public void setProximo(Node proximo) {this.proximo = proximo;}
}
