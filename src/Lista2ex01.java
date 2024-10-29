import java.util.Scanner;

public class Lista2ex01 {
    public static void main(String[] args) {
        /*Crie um algoritmo que leia dois números e informe qual deles é o maior.
Informe também caso os números sejam iguais. */
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        numero1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("Primeiro número é maior");
        } else if (numero1 < numero2) {
            System.out.println("Segundo número é maior");
        } else {
            System.out.println("Números iguais");
        }
        sc.close();
    }
}
