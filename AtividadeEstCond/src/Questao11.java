import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        double porcentagem = 0;
        double aumento = 0;
        System.out.print("Digite o seu salario: ");
        salario = scanner.nextDouble();
        
        if (salario <= 1000){
            porcentagem = 1.2;
            aumento = salario * porcentagem;
        } else if (salario > 1000 && salario <=3000){
            porcentagem = 1.15;
            aumento = salario * porcentagem;
        }else if (salario > 3000 && salario <=8000){
            porcentagem = 1.10;
            aumento = salario * porcentagem;
        }else if (salario > 8000){
            porcentagem = 1.05;
            aumento = salario * porcentagem;
        }

        System.out.printf("Novo salario: %.2f \n", aumento );
        System.out.printf("Aumento: %.2f \n", aumento-salario  );
        System.out.printf("A porcentagem foi de: %.0f porcento \n", (porcentagem-1)*100);
        scanner.close();
    }
}
