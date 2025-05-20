import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de linhas da matriz A: ");
        int linhasA = scanner.nextInt();
        System.out.print("Informe o número de colunas da matriz A: ");
        int colunasA = scanner.nextInt();

        System.out.print("Informe o número de linhas da matriz B: ");
        int linhasB = scanner.nextInt();
        System.out.print("Informe o número de colunas da matriz B: ");
        int colunasB = scanner.nextInt();

        if (colunasA != linhasB) {
              System.out.println("Multiplicação impossível: o número de colunas da matriz A deve ser igual ao número de linhas da matriz B.");
              return;
        }

        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];
        int[][] C = new int[linhasA][colunasB];

        System.out.println("Preencha os valores da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                   System.out.print("A[" + i + "][" + j + "]: ");
                   A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Preencha os valores da matriz B:");
          for (int i = 0; i < linhasB; i++) {
             for (int j = 0; j < colunasB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

           System.out.println("Matriz Produto:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
