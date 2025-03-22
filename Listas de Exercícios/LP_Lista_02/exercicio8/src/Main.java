import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor em polegadas: ");
        double pole1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor em polegadas: ");
        double pole2 = scanner.nextDouble();

        double media = (pole1 + pole2) / 2;
        double mm = media / 0.03937;
        System.out.println("A média de " + pole1 + " polegadas e " + pole2 + " polegadas é = " + media + " polegadas, que transformado em milímetros é = " + mm);

        scanner.close();
    }
}