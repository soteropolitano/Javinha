import java.util.Scanner;

public class AdvinheONumero {
    public static void iniciarJogo(int numeroFixo) {
        int palpite;

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Loop para repetir a solicitação de palpite até que o usuário adivinhe o número
        while (true) {
            // Solicita ao usuário para adivinhar o número
            System.out.print("Adivinhe o número (entre 1 e 10): ");
            palpite = scanner.nextInt();

            // Verifica se o palpite é igual ao número fixo
            if (palpite == numeroFixo) {
                System.out.println("Parabéns! Você acertou o número.");
                break; // Encerra o loop pois o usuário acertou o número
            } else if (palpite < numeroFixo) {
                System.out.println("O palpite é muito baixo. Tente novamente.");
            } else {
                System.out.println("O palpite é muito alto. Tente novamente.");
            }
        }
    }
}
