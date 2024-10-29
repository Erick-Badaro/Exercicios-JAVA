import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args){
        /*  Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe seu salário: ");
        double salario = sc.nextDouble();
        System.out.println("Olá " +nome + ", seu salário é de R$: " +salario);
        sc.close();


    }
}
