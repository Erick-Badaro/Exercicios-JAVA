import java.util.Scanner;

public class Ex05 {
    public static void main (String[] args){
        //  Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2) /2;
        System.out.println("A sua média na disciplina é: " +media);
        sc.close();

    }
}
