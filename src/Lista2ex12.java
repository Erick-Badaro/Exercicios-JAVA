import java.util.Scanner;

public class Lista2ex12 {
    public static void main(String[] args) {
        /*Em uma escola, os alunos ganham premiações de acordo com o seu desempenho ao longo do ano letivo, conforme
        tabela abaixo:
        Excursão Nota acima de 80 e 0% de faltas
        Camiseta Nota acima de 80 ou 100% de presença
        Squeeze Nota entre 70 e 80 e pelo menos 90% de presença
        Caneta personalizada Nota entre 70 e 80 ou pelo menos 90% de presença
        Baseado na tabela, crie um algoritmo que receba 4 notas de um aluno entre 0 e 100, quantidade de aulas dadas,
        quantidade de presenças e informe qual o prêmio a ser recebido pelo aluno. Caso o aluno não esteja em nenhuma das
condições da tabela, o algoritmo deve informar que não há prêmios. */
        String msg = "";
        int nota1, nota2, nota3, nota4, qtdAulas, presenca, media;
        double totalPresenca;
        Scanner sc = new Scanner(System.in);
        // entrada de dados
        System.out.println("Informe as 4 notas do aluno de 0 a 100: ");
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();
        nota4 = sc.nextInt();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Informe a quantidade de aulas dadas: ");
        qtdAulas = sc.nextInt();
        System.out.println("Em quantas aulas esteve presente: ");
        presenca = sc.nextInt();
        totalPresenca = ((double) presenca / qtdAulas) * 100;

        if (media > 80 && totalPresenca == 100){
            msg = "Parabéns, você ganhou uma excursão!";
        } else if (media > 80 || totalPresenca == 100){
            msg = "Parabéns, você ganhou uma camiseta!";
        } else if(media > 70 && totalPresenca >= 90){
            msg = "Parabéns, você ganhou uma Squeeze";
        } else if(media > 70 || totalPresenca >=90){
            msg = "Parabéns, você ganhou uma caneta personalizada!";
        } else{
            msg = "Não há premios";
            System.err.println(msg);
            return;
        }
        System.out.println(msg);
        sc.close();
    }
}
