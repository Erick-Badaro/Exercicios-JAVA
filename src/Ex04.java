import java.util.Scanner;
public class Ex04 {
public static void main (String[] args){
    //  Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int num1 = sc.nextInt();
    System.out.println("Digite outro número: ");
    int num2 = sc.nextInt();
    int soma = num1 + num2;
    System.out.println("A soma entre o número " +num1 + " e o número " +num2 + " é igual a: " +soma);
    sc.close();
}
}

