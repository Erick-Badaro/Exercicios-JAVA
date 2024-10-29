import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        /* Crie um algoritmo que receba três notas e seus respectivos pesos, calcule e
mostre a média ponderada entre elas.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a 1º nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Informe o peso: ");
        int p1 = sc.nextInt();
        System.out.println("Informe a 2º nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Informe o peso: ");
        int p2 = sc.nextInt();
        System.out.println("Informe a 3° nota: ");
        double n3 = sc.nextDouble();
        System.out.println("Informe o peso: ");
        int p3 = sc.nextInt();

        double mp = ((n1*p1) + (n2*p2) + (n3*p3)) / (p1 + p2 + p3);
        System.out.printf("A média ponderada corresponde a: %.2f",mp);
        sc.close();
    }

}
