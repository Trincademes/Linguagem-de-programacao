import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor em milhas: ");
        double mi1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor em milhas: ");
        double mi2 = scanner.nextDouble();

        double media = (mi1 + mi2) / 2;
        double km = media / 0.621371;
        System.out.println("A média de velocidade de " + mi1 + " milhas e " + mi2 + " milhas é = " + media + " milhas, que convertido em quilômetros é = " + km);

        scanner.close();
    }
}