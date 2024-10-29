import java.util.Scanner;

public class Lista2ex05 {
    public static void main(String[] args) {
        /* Crie um algoritmo que receba como entrada o sexo de uma pessoa (M para
        Masculino e F para Feminino), sua altura (em centímetros) e calcule o seu
        peso ideal, utilizando as seguintes fórmulas:
        • Homens ➔ 52 + (0,75 * (altura - 152,4))
        • Mulheres ➔ 52 + (0,67 * (altura - 152,4)) */

        Scanner sc = new Scanner(System.in);
        String sexo;
        double altura, pesoIdeal;

        System.out.println("Informe seu sexo (M/F): ");
        sexo = sc.next();
        System.out.println("Informe sua altura em centímetros: ");
        altura = sc.nextDouble();

        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino")) {
            pesoIdeal = 52 + (0.75 * (altura - 152.4));
        } else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("Feminino")) {
            pesoIdeal = 52 + (0.67 * (altura - 152.4));
        } else {
            System.out.println("Sexo inválido. Use 'M' para Masculino ou 'F' para Feminino.");
            sc.close();
            return;
        }

        System.out.printf("Sexo: %s%nAltura: %.0f cm%nPeso Ideal: %.2f kg%n", sexo, altura, pesoIdeal);
        sc.close();
    }
}
