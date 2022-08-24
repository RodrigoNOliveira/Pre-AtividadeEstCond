import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int minutos;

        System.out.println("Digite os minutos utilizados: ");
        minutos = scanner.nextInt();

        if (minutos > 0 && minutos <= 100) {
            System.out.println("Valor a pagar: R$50,00");
        } else if (minutos > 100) {
            float total = (minutos - 100) * 2 + 50;
            System.out.printf("Valor a pagar: R$%.2f", total);
        } else {
            System.out.println("Valor invalido");
        }

        scanner.close();

    }

}
