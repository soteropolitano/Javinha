import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário mensal: R$ ");
        double salario = scanner.nextDouble();

        double impostoRenda = 0.0;

        if (salario <= 1903.98) {
            impostoRenda = 0.0;
        } else if (salario <= 2826.65) {
            impostoRenda = (salario * 0.075) - 142.80;
        } else if (salario <= 3751.05) {
            impostoRenda = (salario * 0.15) - 354.80;
        } else if (salario <= 4664.68) {
            impostoRenda = (salario * 0.225) - 636.13;
        } else {
            impostoRenda = (salario * 0.275) - 869.36;
        }

        System.out.printf("O valor do Imposto de Renda a ser pago é: R$ %.2f%n", impostoRenda);

        scanner.close();
    }
}
