import java.util.Scanner;

public class VerificacaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do teste (de 0 a 100): ");
        int nota = scanner.nextInt();

        if (nota >= 60) {
            System.out.println("Parabéns! Você passou.");
        } else {
            System.out.println("Infelizmente, você não passou.");
        }

        scanner.close();
    }
}
