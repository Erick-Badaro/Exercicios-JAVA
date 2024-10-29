import java.util.Scanner;

public class Lista2ex06 {
    public static void main(String[] args) {
        /* Crie um algoritmo que leia o salário de um funcionário, calcule e mostre seu
        novo salário acrescido de bonificação e auxílio escola:
        Abaixo de R$ 2000,00 (inclusive): Bonificação = 10%
        Entre R$ 2000,01 e R$ 3000,00 (inclusive): Bonificação = 8%
        Acima de R$ 3000,00: Bonificação = 5%
        Abaixo de R$ 2500,00 (inclusive): Auxílio escola = R$ 350,00
        Acima de R$ 2500,00: Auxílio escola = R$ 300,00
        */

        double salario, bonificacao, auxilioEscola, novoSalario;
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.println("Informe o salário: ");
        salario = sc.nextDouble();

        if (salario <= 2000) {
            bonificacao = salario * 0.10;
        } else if (salario <= 3000) {
            bonificacao = salario * 0.08;
        } else {
            bonificacao = salario * 0.05;
        }

        if (salario <= 2500) {
            auxilioEscola = 350;
        } else {
            auxilioEscola = 300;
        }

        novoSalario = salario + bonificacao + auxilioEscola;

        System.out.printf("Funcionário: %s%n", nome);
        System.out.printf("Salário atual: R$ %.2f%n", salario);
        System.out.printf("Bonificação: R$ %.2f%n", bonificacao);
        System.out.printf("Auxílio Escola: R$ %.2f%n", auxilioEscola);
        System.out.printf("Novo Salário: R$ %.2f%n", novoSalario);

        sc.close();
    }
}
