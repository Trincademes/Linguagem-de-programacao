import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double cel = scanner.nextDouble();
        double fa = (cel* 9/5) + 32;
        System.out.println(cel + "°C equivale a " + fa+ "°F");
    }
}