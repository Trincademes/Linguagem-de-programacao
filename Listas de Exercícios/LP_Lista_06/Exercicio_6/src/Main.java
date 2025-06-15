import java.util.Scanner;

public class MainRecursivo {

    public static int somarAntecessoresRec(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("N deve ser maior que zero.");
        if (n == 1)
            return 1;
        return n + somarAntecessoresRec(n - 1);
    }

    public static int fatorialRec(int n) {
        if (n < 0)
            throw new IllegalArgumentException("N deve ser >= 0.");
        if (n == 0 || n == 1)
            return 1;
        return n * fatorialRec(n - 1);
    }

    public static int potenciaRec(int x, int y) {
        if (y < 0)
            throw new IllegalArgumentException("Expoente deve ser >= 0.");
        if (y == 0)
            return 1;
        return x * potenciaRec(x, y - 1);
    }

    public static boolean ehPalindromoRec(String texto) {
        texto = texto.toLowerCase().replaceAll("\\s+", "");
        return verificarPalindromoRec(texto, 0, texto.length() - 1);
    }

    private static boolean verificarPalindromoRec(String texto, int inicio, int fim) {
        if (inicio >= fim)
            return true;
        if (texto.charAt(inicio) != texto.charAt(fim))
            return false;
        return verificarPalindromoRec(texto, inicio + 1, fim - 1);
    }

    public static int buscaBinariaRec(int[] vetor, int alvo) {
        return buscaBinariaRecAux(vetor, alvo, 0, vetor.length - 1);
    }

    private static int buscaBinariaRecAux(int[] vetor, int alvo, int inicio, int fim) {
        if (inicio > fim)
            return -1;
        int meio = (inicio + fim) / 2;
        if (vetor[meio] == alvo)
            return meio;
        else if (vetor[meio] < alvo)
            return buscaBinariaRecAux(vetor, alvo, meio + 1, fim);
        else
            return buscaBinariaRecAux(vetor, alvo, inicio, meio - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

      
        int n;
        do {
            System.out.print("Digite um inteiro maior que zero para soma: ");
            n = in.nextInt();
        } while (n <= 0);
        System.out.println("Soma recursiva de 1 até " + n + " = " + somarAntecessoresRec(n));

      
        do {
            System.out.print("Digite um inteiro maior ou igual a zero para fatorial: ");
            n = in.nextInt();
        } while (n < 0);
        System.out.println(n + "! = " + fatorialRec(n));

    
        System.out.print("Digite a base (x) da potência: ");
        int x = in.nextInt();
        do {
            System.out.print("Digite o expoente (y >= 0): ");
            n = in.nextInt();
        } while (n < 0);
        System.out.println(x + " ^ " + n + " = " + potenciaRec(x, n));

        in.nextLine(); 
        System.out.print("Digite uma palavra ou frase para verificar palíndromo: ");
        String texto = in.nextLine();
        if (ehPalindromoRec(texto)) {
            System.out.println("'" + texto + "' é palíndromo.");
        } else {
            System.out.println("'" + texto + "' não é palíndromo.");
        }

        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.print("Vetor: ");
        for (int v : vetor) System.out.print(v + " ");
        System.out.println();

        System.out.print("Digite o número a buscar no vetor: ");
        int alvo = in.nextInt();
        int pos = buscaBinariaRec(vetor, alvo);
        if (pos != -1) {
            System.out.println("Elemento encontrado na posição: " + pos);
        } else {
            System.out.println("Elemento não encontrado no vetor.");
        }

        in.close();
    }
}
