import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor em mm: ");
        double mm1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor em mm: ");
        double mm2 = scanner.nextDouble();

        double media = (mm1 + mm2) / 2;
        double pole = media * 0.03937;
        System.out.println("A média de " + mm1 + " mm e " + mm2 + " mm é = " + media + " mm, que transformado em polegadas é = " + pole);

        scanner.close();
    }
}