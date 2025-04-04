import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (contador < 5) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            num = scanner.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            contador++;
        }

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        scanner.close();
    }
}
