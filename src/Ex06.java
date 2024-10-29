import java.util.Scanner;
public class Ex06 {
    public static void main (String[] args){
        // Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int ant = numero - 1;
        int suc = numero + 1;
        System.out.println("O antecessor de " +numero + " é " +ant + " e o sucessor é: " +suc);
        sc.close();
    }
}
