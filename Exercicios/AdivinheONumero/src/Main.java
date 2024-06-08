import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroSecreto = 7;

        Scanner scanner = new Scanner(System.in);

        int palpite;

        while (true) {
            System.out.print("Adivinhe o número (entre 1 e 10): ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você adivinhou o número.");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Seu palpite é muito baixo. Tente novamente.");
            } else {
                System.out.println("Seu palpite é muito alto. Tente novamente.");
            }
        }

        scanner.close();
    }
}
