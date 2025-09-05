import java.util.Random;

public class Questoes {
    static Random random = new Random();

    public static void mainQ1() {
        PilhaListaEncadeada pilha = new PilhaListaEncadeada();

        int opcao; // CASO 1 insere CASO 2 remove
        int valor;
        for(int i = 0; i < 10; i++){
            opcao = random.nextInt(2); // 0 OU 1
            valor = random.nextInt(100); // VALOR ALEATORIO DO NÓ
            if(opcao == 1){
                pilha.inserir(valor);
            }
            else{
                pilha.remover();
            }
            pilha.imprimir(); // IMPRIME O ESTADO DA LISTA A CADA OPERAÇÃO
        }
    }

    public static void mainQ2() {
        FilaListaEncadeada fila = new FilaListaEncadeada();

        int opcao; // CASO 1 insere CASO 2 remove
        int valor;
        for(int i = 0; i < 10; i++){
            opcao = random.nextInt(2); // 0 OU 1
            valor = random.nextInt(100); // VALOR ALEATORIO DO NÓ
            if(opcao == 1){
                fila.inserir(valor);
            }
            else{
                fila.remover();
            }
            fila.imprimir(); // IMPRIME O ESTADO DA LISTA A CADA OPERAÇÃO
        }
    }

}