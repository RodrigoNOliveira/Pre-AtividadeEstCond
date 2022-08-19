import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();

        int menor = valor1;
        if (valor2 < menor) {
            menor = valor2;
        } else if (valor3 < menor) {
            menor = valor3;
        }
        System.out.println("O menor valor é: " + menor);
        scanner.close();
    }
}
