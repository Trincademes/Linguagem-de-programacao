import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do cone  ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a basa do cone   ");
        double altura = scanner.nextDouble();

        double volume = (1 / 3) * Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume do cone com raio " + raio + " e altura de " +altura+ "é = " + volume);
    }
}