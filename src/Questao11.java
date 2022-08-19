import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario, aumento;

        System.out.print("Digite o seu salario: ");
        salario = scanner.nextInt();
        
        if (salario <= 1000){
            aumento = salario * 0.2;
        } else if (salario > 1000 && salario <=3000){
            salario *= 0.15;
        }else if (salario > 3000 && salario <=8000){
            salario *= 0.1;
        }else if (salario > 8000){
            salario *= 0.05;
        }

        
        scanner.close();
    }
}
