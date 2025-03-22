import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;
if( a == 0){
    System.out.println("A é igual a zero");
}
        if (delta > 0) {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes reais são: x1 = " + x1 + " e x2 = " + x2);

        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A raiz real é: x = " + x);
        } else {
            System.out.println("Não existem raízes reais.");
        }

        scanner.close();
    }
}