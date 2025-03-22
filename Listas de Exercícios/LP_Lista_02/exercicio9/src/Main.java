import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor em km/h: ");
        double km1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor em km/h: ");
        double km2 = scanner.nextDouble();

        double media = (km1 + km2) / 2;
        double milhas = media * 0.621371;
        System.out.println("A média de velocidade de " + km1 + " km/h e " + km2 + " km/h é = " + media + " km/h, que convertido em milhas é = " + milhas);

        scanner.close();
    }
}