import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2, valor3;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextDouble();

        double maior = valor1;
        if (valor2 > maior) {
            maior = valor2;
        } else if (valor3 > maior) {
            maior = valor3;
        }
        System.out.printf("A maior distância é: %.2f" , maior);
        scanner.close();

    }
}
