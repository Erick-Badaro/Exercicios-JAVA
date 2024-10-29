import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        /* Crie um algoritmo que receba o nome e o salário de um funcionário. Após
isso, calcule seu novo salário sabendo que ele recebeu um aumento de 25%
e mostre uma frase com o nome, o valor do aumento e o novo salário  */
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe o seu salário: ");
        double salario = sc.nextDouble();
        double aumento = salario * 0.25;
        double novoSalario = salario + aumento;
        System.out.printf("Funcionário %s, você teve um aumento de: R$ %.2f, seu novo salário é: R$%.2f", nome,aumento,novoSalario);
        sc.close();

    }

}
