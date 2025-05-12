import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            boolean perdeu = false;

            for (int i = 1; i <= 10 && !perdeu; i++) {
                for (int j = 1; j <= 10 && !perdeu; j++) {
                    System.out.print("Quanto é " + i + " x " + j + "? ");
                    int respostaUsuario = scanner.nextInt();
                    int respostaCorreta = i * j;

                    if (respostaUsuario == respostaCorreta) {
                        System.out.println("Correto!");
                    } else {
                        System.out.println("Errado! A resposta correta era: " + respostaCorreta);
                        System.out.println("Você perdeu o jogo!");
                        perdeu = true;
                    }
                }
            }

            if (!perdeu) {
                System.out.println("🎉 Parabéns! Você completou todas as tabuadas!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("s")) {
                jogarNovamente = false;
                System.out.println("Obrigado por jogar!");
            }
        }

        scanner.close();
    }
}
