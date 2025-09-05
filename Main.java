import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int opcao = 1;

        while(opcao != 0){
            System.out.print("Digite o numero da questao (0 para encerrar): ");
            opcao = leitor.nextInt();

            System.out.println("---------------------------------");
            switch (opcao){
                case 1:
                    Questoes.mainQ1();
                    break;

                case 2:
                    Questoes.mainQ2();
                    break;
//                case 3:
//                    Questoes.mainQ3();
//                    break;
            }
            System.out.println("---------------------------------");
        }
    }
}
