import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        /*Crie um algoritmo que receba dois valores literais, armazene-os em variáveis
distintas e após o armazenamento troque os conteúdos das variáveis. Ao
término, o algoritmo deve mostrar o novo conteúdo de cada variável. */
        Scanner sc = new Scanner(System.in);
        String a,b,troca;
        System.out.println("Informe um valor para a variável a: ");
        a = sc.nextLine();
        System.out.println("Informe um valor para a variável b: ");
        b = sc.nextLine();
        troca = a;
        a = b;
        b = troca;
        System.out.println("Variável A: " +a);
        System.out.println("Variável B: "+b);
        sc.close();
    }
}
