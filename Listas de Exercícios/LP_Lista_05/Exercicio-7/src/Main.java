import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int maiorSomaLinha = Integer.MIN_VALUE;
        int maiorSomaColuna = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
            }
            if (somaColuna > maiorSomaColuna) {
                maiorSomaColuna = somaColuna;
            }
        }

        System.out.println("\nMaior soma entre as linhas: " + maiorSomaLinha);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColuna);

        scanner.close();
    }
}
