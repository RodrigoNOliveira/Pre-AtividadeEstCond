import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char opcao;
        double temp, conv;


        System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
        opcao = scanner.next().charAt(0);
        if (opcao == 'F' || opcao == 'f'){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temp = scanner.nextDouble();
            conv = (temp - 32) * (5.00/9.00);
            System.out.printf("Temperatura equivalente em Celsius: %.2fº", conv);
        }     
        else if ( opcao == 'C'|| opcao == 'c'){
            System.out.print("Digite a temperatura em Celsius: ");
            temp = scanner.nextDouble();
            conv =  (temp *1.8) +32; 
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2fº", conv);
        }   
        
        scanner.close();
    }
}
