import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a valor de A  ");
        double a = scanner.nextDouble();

        System.out.print("Digite o v alor de B   ");
        double b = scanner.nextDouble();
        if (a != 0) {
            double x = -b / a;
            System.out.println("A solução da equação " + a + "x + " + b + " = 0 é: x = " + x);
        } else {
            // Se a for zero, verifica se b também é zero
            if (b == 0) {
                System.out.println("A equação tem infinitas soluções.");
            } else {
                System.out.println("A equação não tem solução.");
            }
        }
    }
}