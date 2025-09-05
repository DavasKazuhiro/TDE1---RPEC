public class MergeVetores {
    public static int[] merge(int[] A, int[] B) {

        int tamanhoA = 4;
        int tamanhoB = 5;


        int[] C = new int[tamanhoA + tamanhoB];

        int contA = 0; 
        int contB = 0; 
        int contC = 0; 

        while (contA < tamanhoA && contB < tamanhoB) {
            if (A[contA] <= B[contB]) {
                C[contC] = A[contA];
                contA++;
            } else {
                C[contC] = B[contB];
                contB++;
            }
            contC++;
        }

        while (contA < tamanhoA) {
            C[contC] = A[contA];
            contA++;
            contC++;
        }

        while (contB < tamanhoB) {
            C[contC] = B[contB];
            contB++;
            contC++;
        }

        return C;
    }
}