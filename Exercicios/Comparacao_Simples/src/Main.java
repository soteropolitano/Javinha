import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }

        scanner.close();
    }
}
