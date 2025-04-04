import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

long fatorial = 1;
        System.out.print("Digite um número para ver a tabuada: ");
        int num1 = scanner.nextInt();


        for(int i = 1; i <= num1; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num1 + " é: " + fatorial);

        scanner.close();
    }
}
