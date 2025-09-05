public class Merge {

    Node consultaInicio;


    public static FilaListaEncadeada mergeFilas(FilaListaEncadeada A, FilaListaEncadeada B) {
        FilaListaEncadeada C = new FilaListaEncadeada();

        while (!A.vazia() && !B.vazia()) {
            int valorA = A.veInicio(); 
            int valorB = B.veInicio();

            if (valorA <= valorB) {
                C.inserir(valorA);
                A.remover();
            } else {
                C.inserir(valorB);
                B.remover();
            }
        }

        while (!A.vazia()) {
            int valorA = A.veInicio(); 
            C.inserir(valorA);
            A.remover();
        }

        while (!B.vazia()) {
            int valorB = B.veInicio();
            C.inserir(valorB);
            B.remover();
        }

        return C;
    }
}
