import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        /* Crie um algoritmo que receba o raio de um círculo, calcule e mostre a sua
área e o seu perímetro. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio do círculo: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio,2);
        double perimetro = 2 * Math.PI * raio;
        System.out.printf("Área do círculo corresponde a: %.2f%n Perímetro corresponde a: %.2f", area, perimetro);
        sc.close();
    }
}
