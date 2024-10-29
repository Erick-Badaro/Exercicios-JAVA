import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        /*Crie um algoritmo que receba como entrada o valor do saque a ser realizado
pelo cliente de um banco e retorne quantas notas de cada valor serão
necessárias para atender ao saque com a menor quantidade de notas
possível. Serão utilizadas notas de 100, 50, 20, 10 e 5 reais. Dica ➔ lembrese do operador de resto da divisão de inteiros (%). Considere que os valores
informados para saque serão sempre múltiplos de 5. */
        Scanner sc = new Scanner(System.in);
        int nota100,nota50,nota20,nota10,nota5;
        System.out.println("===BANCO CENTRAL===");
        System.out.println("Informe o valor do saque: ");
        int saque = sc.nextInt();
        nota100 = saque/100;
        saque = saque % 100;

        nota50 = saque/50;
        saque = saque % 50;

        nota20 = saque/20;
        saque = saque % 20;

        nota10 = saque/10;
        saque = saque % 10;

        nota5 = saque/5;
        saque = saque % 5;
        System.out.println("Notas fornecidas:");
        System.out.printf("Notas de 100: %d%n", nota100);
        System.out.printf("Notas de 50: %d%n", nota50);
        System.out.printf("Notas de 20: %d%n", nota20);
        System.out.printf("Notas de 10: %d%n", nota10);
        System.out.printf("Notas de 5: %d%n", nota5);

        sc.close();
    }
}
