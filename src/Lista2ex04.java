import java.util.Scanner;

public class Lista2ex04 {
    public static void main(String[] args) {
        /*Crie um algoritmo que leia 3 valores e informe se o 3º valor informado está
        entre os 2 primeiros*/
        int numero1, numero2, numero3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        numero1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        numero2 = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        numero3 = sc.nextInt();

        if (numero3 >= numero1 && numero3 <= numero2 || numero3 >= numero2 && numero3 <= numero1) {
            System.out.println("O número  está entre os dois primeiros");
        } else {
            System.out.println("Número não está entre os dois primeiros");
        }
        sc.close();
    }
}
