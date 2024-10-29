import java.util.Scanner;

public class Lista2ex11 {
    public static void main(String[] args) {
    /*Crie um algoritmo que receba 3 notas de um aluno e calcule a média. Casoa média calculada seja maior ou igual a 6,
     o algoritmo deverá exibir a mensagem de aluno aprovado. Caso a média seja abaixo de 5, o algoritmo deverá exibir a
     mensagem de aluno reprovado. Caso a média esteja entre 5 e 6, o algoritmo deverá exibir que o aluno está de
     recuperação e solicitar a nota da atividade de recuperação, calcular uma nova média entre a média
inicial e a nota de recuperação e caso esta nova média seja abaixo de 6 informar que o aluno está reprovado,
caso contrário, informar que o aluno está aprovado por recuperação.*/
        String nome;
        double media, nota1, nota2, nota3, notaRec, mediaRec;
        Scanner sc = new Scanner(System.in);
        // entrada de valores
        System.out.println("Informe o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Informe as 3 notas: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        // cálculo da média
        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            System.out.println("Aluno aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno de recuperação");
            System.out.println("Informe a nota da atividade de recuperação: ");
            notaRec = sc.nextDouble();
            mediaRec = (media + notaRec) / 2;
            if (mediaRec < 6) {
                System.out.println("Aluno reprovado");
            } else {
                System.out.println("Aluno aprovado por RECUPERAÇÃO");
            }
        } else {
            System.out.println("Aluno reprovado");
        }

        sc.close();
    }
}
