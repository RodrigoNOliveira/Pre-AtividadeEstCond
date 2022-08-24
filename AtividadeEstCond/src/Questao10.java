import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1, x2;

        System.out.print("Digite um valor inteiro: ");
        x1 = scanner.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        x2 = scanner.nextInt();

        if (x1 < x2){
            if(x2%x1 == 0){
                System.out.println("São múltiplos");
            }else{
                System.out.println("Não são multiplos");
            }
        }
        else{
            if(x1%x2 == 0){
                System.out.println("São múltiplos");
            } else{
                System.out.println("Não são multiplos");
            }
        }
        
        scanner.close();
    }
}
