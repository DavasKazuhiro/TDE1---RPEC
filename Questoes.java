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


    public static void mainQ31() {
        FilaListaEncadeada A = new FilaListaEncadeada();
        FilaListaEncadeada B = new FilaListaEncadeada();

        A.inserir(1);
        A.inserir(3);
        A.inserir(5);
        A.inserir(7);
        A.inserir(69);


        B.inserir(2);
        B.inserir(4);
        B.inserir(6);
        B.inserir(8);
        B.inserir(690);

        System.out.print("Fila A: ");
        A.imprimir();
        System.out.print("Fila B: ");
        B.imprimir();

        // Faz o merge das duas filas
        FilaListaEncadeada C = Merge.mergeFilas(A, B);

        System.out.print("Fila C (merge encadeado): ");
        C.imprimir();

    }


}
