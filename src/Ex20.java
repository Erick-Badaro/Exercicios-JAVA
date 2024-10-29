import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        /* Crie um algoritmo que receba os valores dos catetos de um triângulo, calcule
e mostre o valor da hipotenusa. */
        Scanner sc = new Scanner(System.in);
        double catA,catB,somaCateto,hip;
        System.out.println("Informe o valor dos catetos do triângulo: ");
        catA=sc.nextDouble();
        catB=sc.nextDouble();
        hip = Math.sqrt(Math.pow(catA,2) + Math.pow(catB,2));
        System.out.printf("O valor da hipotenusa corresponde a: %.0f",hip);
        sc.close();

    }
}
