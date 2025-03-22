import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = scanner.nextDouble();

        if (n1 >= 0) {
            double n2 = Math.sqrt(n1);
            System.out.println("A raiz quadrada do número " + n1 + " é " + n2);
        } else {
            System.out.println("Valor inválido");
        }

        scanner.close();
    }
}