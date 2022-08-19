import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String classificacao= "";

        System.out.printf("Insira a quantidade de glicose presente no seu sangue: ");
        int glicose = scanner.nextInt();

        if (glicose <=100){
            classificacao = "normal";
        }
        else if (glicose >100 && glicose <=140){
            classificacao = "elevada";
        } else if (glicose >140){
            classificacao = "diabetes";
        }

        System.out.println("Classificação: " + classificacao);
        scanner.close();

    }

}
