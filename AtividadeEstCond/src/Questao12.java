import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicial, fim, result;

        System.out.print("Digite o horario inicial: ");
        inicial = scanner.nextInt();
        System.out.print("Digite o horario final: ");
        fim = scanner.nextInt();
        
        if ( inicial > fim){
            result = (24-inicial)+fim;
            
        } else if (inicial == fim){
            result = 24;
        } else{
            result = fim - inicial; 
        }

        if (result < 1 || result > 24){
            System.out.println("Horarios inseridos invalidos!");
        }else {
        System.out.printf("O jogo durou %d horas", result);
        }
        scanner.close();
    }
}
