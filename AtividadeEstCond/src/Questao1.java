import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, total;

        System.out.print("Digite sua primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        nota2 = scanner.nextDouble();
        total = nota1 + nota2;

        System.out.printf("Sua nota final foi de: %.1f", total);
        System.out.println();
        if (total < 60) {

            System.out.println("Você foi reprovado!");
        }

        scanner.close();
    }
}
