import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int posMaior = 0;
        int menor = vetor[0];
        int posMenor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }

        // Exibe os resultados
        System.out.println("\nMaior valor: " + maior + " na posição " + posMaior);
        System.out.println("Menor valor: " + menor + " na posição " + posMenor);

        scanner.close();
    }
}
