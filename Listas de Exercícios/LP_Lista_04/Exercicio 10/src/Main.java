import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, informe um número maior que 0.");
        } else {
            System.out.println("Sequência de Fibonacci até o " + n + "º termo:");

            int a = 0, b = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(a + (i < n ? ", " : "\n"));
                int proximo = a + b;
                a = b;
                b = proximo;
            }
        }

        scanner.close();
    }
}
