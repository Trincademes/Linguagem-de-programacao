import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura do triangulo  ");
        double altura = scanner.nextDouble();
        System.out.print("Digite a basa do tringulo    ");
        double base = scanner.nextDouble();
        double area = (base * altura)/2;
        System.out.println("A área do trinagulo com base " + base + " e altura de " +altura+ "é = " + area);
    }
}