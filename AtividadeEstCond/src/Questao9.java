import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cdg, qtd;
        double valor;
        String msg = "";

        System.out.print("Digite o codigo do produto: ");
        cdg = scanner.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        qtd = scanner.nextInt();
        System.out.println();

        switch (cdg) {

            case 1:
                valor = qtd * 5.35;
                msg = "Valor total: " + valor;
                break;
            case 2:
                valor = qtd * 6;
                msg = "Valor total: " + valor;
                break;
            case 3:
                valor = qtd * 9;
                msg = "Valor total: " + valor;
                break;
            default:
                msg = "Codigo invalido";
        }

        System.out.println(msg);
        scanner.close();
    }
}
