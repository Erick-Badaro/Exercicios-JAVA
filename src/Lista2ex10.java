import java.util.Scanner;

public class Lista2ex10 {
    public static void main(String[] args) {
        /*Crie um algoritmo que receba a hora de início e a hora de término de um jogo
(cada hora é composta por duas variáveis hora e minuto). Calcule e mostre a
duração do jogo (horas e minutos), sabendo-se que o tempo máximo da
duração do jogo é de 24 horas e que ele pode iniciar-se em um dia e terminar
no dia seguinte. */
        int horaInicio, minutoInicio, horaTermino, minutoTermino, totalMinutosInicio, totalMinutosTermino, duracao, horas, minutos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a hora de início do jogo: ");
        horaInicio = sc.nextInt();
        System.out.println("Informe o minuto que o jogo iniciou: ");
        minutoInicio = sc.nextInt();
        System.out.println("Informe a hora que terminou: ");
        horaTermino = sc.nextInt();
        System.out.println("Informe o minuto que terminou: ");
        minutoTermino = sc.nextInt();
        // Converter para minutos
        totalMinutosInicio = horaInicio * 60 + minutoInicio;
        totalMinutosTermino = horaTermino * 60 + minutoTermino;
        // comparação para determinar duração
        if (totalMinutosTermino >= totalMinutosInicio) {
            duracao = totalMinutosTermino - totalMinutosInicio;
        } else {
            duracao = (1440 - totalMinutosInicio) + totalMinutosTermino;
        }
        // Convertendo de volta para horas e minutos
        horas = duracao / 60;
        minutos = duracao % 60;
        System.out.printf("A duração do jogo foi de %d horas e %d minutos", horas, minutos);
        sc.close();
    }
}
