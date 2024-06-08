import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de ponto flutuante: ");
        double numeroFlutuante = scanner.nextDouble();

        int numeroInteiro = (int) numeroFlutuante;

        System.out.println("Número de ponto flutuante: " + numeroFlutuante);
        System.out.println("Número inteiro (após conversão): " + numeroInteiro);

        scanner.close();
    }
}
