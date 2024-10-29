import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        /* Crie um algoritmo que receba o salário bruto de um funcionário e exiba o seu
salário líquido, sabendo que ele tem 10% de gratificação sobre o salário bruto
e tem 15% de descontos sobre o salário após a gratificação.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu salário bruto: ");
        double salBruto = sc.nextDouble();
        double grat = salBruto * 0.10;
        double desc = salBruto * 0.15;
        double salLiquido = salBruto + grat - desc;
        System.out.printf("Seu salário bruto é: %.2f%nVocê possui gratificação de 10%% e descontos de 15%%, %nportanto seu salário líquido é: %.2f", salBruto, salLiquido);
        sc.close();
    }
}
