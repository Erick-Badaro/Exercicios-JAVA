import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        // Programa para ler o nome do usuário e mandar uma mensagem de boas vindas

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Seja-bem-vindo " +nome + "!");
        sc.close();

    }

}
