import java.util.Scanner;

public class BuscaBinariaIterativa {

    public static int buscaBinaria(int[] vetor, int alvo) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == alvo) {
                return meio;
            } else if (vetor[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.print("Vetor: ");
        for (int v : vetor) {
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.print("Digite o número a buscar: ");
        int alvo = sc.nextInt();

        int pos = buscaBinaria(vetor, alvo);
        if (pos != -1) {
            System.out.println("Elemento encontrado na posição: " + pos);
        } else {
            System.out.println("Elemento não encontrado no vetor.");
        }

        sc.close();
    }
}
