import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        double delta, x1, x2;

        System.out.println("Digite um valor para a, b e c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta < 0) {
            System.out.println("Esta equação não possui raizes");
        } else {
            System.out.printf("O valor de x1 é %.4f e o valor de x2 é %.4f", x1, x2);
        }
        scanner.close();

    }
}
