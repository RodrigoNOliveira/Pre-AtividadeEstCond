import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int qtd;
        double valor, troco, recebido, total;

        System.out.print("Preço unitário do produto: ");
        valor = scanner.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtd = scanner.nextInt();
        System.out.print("Dinheiro recebido: ");
        recebido = scanner.nextDouble();
        total = valor * qtd;
        troco = recebido - total;

        if (recebido < total) {
            System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + troco * -1 + " REAIS");
        } else {
            System.out.println("Troco: " + troco);
        }

        scanner.close();

    }

}
