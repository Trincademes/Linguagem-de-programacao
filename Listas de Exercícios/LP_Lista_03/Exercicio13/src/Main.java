import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibição do menu
        System.out.println("--------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Círculo");
        System.out.println("    2. Triângulo Retângulo");
        System.out.println("    3. Retângulo");
        System.out.println("--------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        System.out.println("--------------------------");

        switch (opcao) {
            case 1:
                System.out.print("Informe o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                double perimetroCirculo = 2 * Math.PI * raio;
                System.out.println("Área = " + areaCirculo);
                System.out.println("Perímetro = " + perimetroCirculo);
                break;
            case 2:
                System.out.print("Informe a base: ");
                double baseTri = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaTri = scanner.nextDouble();
                double areaTriangulo = (baseTri * alturaTri) / 2;
                double perimetroTriangulo = baseTri + alturaTri + Math.sqrt(Math.pow(baseTri, 2) + Math.pow(alturaTri, 2));
                System.out.println("Área = " + areaTriangulo);
                System.out.println("Perímetro = " + perimetroTriangulo);
                break;
            case 3:
                System.out.print("Informe a largura: ");
                double largura = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaRet = scanner.nextDouble();
                double areaRetangulo = largura * alturaRet;
                double perimetroRetangulo = 2 * (largura + alturaRet);
                System.out.println("Área = " + areaRetangulo);
                System.out.println("Perímetro = " + perimetroRetangulo);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
