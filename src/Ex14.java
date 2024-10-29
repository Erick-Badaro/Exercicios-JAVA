import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        /* Crie um algoritmo que receba como entrada a base e a altura de um triângulo,
calcule e mostre a sua área.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a base do triângulo: ");
        double base = sc.nextDouble();
        System.out.println("Informe a altura do triângulo: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.printf("A área do triângulo corresponde a: %.2f",area);
        sc.close();


    }
}
