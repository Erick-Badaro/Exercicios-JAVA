import java.util.Scanner;
public class Ex09 {
    public static void main (String [] args){
        /* Faça um algoritmo que leia quanto dinheiro uma pessoa
        tem na carteira (em R$)e mostre quantos dólares ela pode comprar.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto de dinheiro você possui na carteira?: ");
        double dinheiro = sc.nextDouble();
        System.out.println("Qual a cotação do dólar?: ");
        double cotacao = sc.nextDouble();
        double resultado = dinheiro / cotacao;
        System.out.printf("Você pode comprar U$$: %.2f" , resultado);
        sc.close();

    }
}
