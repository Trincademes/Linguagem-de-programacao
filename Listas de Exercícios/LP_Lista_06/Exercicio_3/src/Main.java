import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base ");
        int x = scanner.nextInt();
        System.out.print("Digite o expoente  ");
        int y = scanner.nextInt();
        System.out.print("O resultado é " +potencia(x, y));

    }
    public static int potencia (int x , int y){
        int base = x;
        for (int i = 1; i <y ; i++){
           x *= base;
        }
          return x;

    }
}