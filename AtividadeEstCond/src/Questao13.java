import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x, y;
        String quadrante = "";

        System.out.print("Digite o valor de x: ");
        x = scanner.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = scanner.nextDouble();

        if (x > 0 && y >0){
            quadrante= "Q1";
        } else if (x > 0 && y <0){
            quadrante= "Q4";
        } else if (x < 0 && y <0){
            quadrante= "Q3";
        } else if (x < 0 && y > 0){
            quadrante= "Q2";
        } else if (x == 0 && y == 0){
            quadrante = "Origem";
        } else if (x > 0 || x < 0  && y == 0){
            quadrante = "Eixo X";
        }
        else if (y > 0 || y < 0  && x == 0){
            quadrante = "Eixo Y";
        }

        System.out.println("O quadrante a eles pertencido: " + quadrante);

        scanner.close();
    }
}
