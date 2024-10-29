import java.util.Scanner;

public class Lista2ex02 {
    public static void main(String[] args) {
        /*Crie um algoritmo que leia 3 números e informe qual o menor. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int numero2 = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        int numero3 = sc.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("Primeiro número é o menor");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("Segundo número é o menor");
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println("Terceiro número é o menor");
        } else {
            System.out.println("Números iguais");
        }
        sc.close();
    }
}
