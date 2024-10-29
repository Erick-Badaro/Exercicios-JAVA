import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        /* Sabe-se que 1 𝑝é = 12 𝑝𝑜𝑙𝑒𝑔𝑎𝑑𝑎𝑠, 1 𝑗𝑎𝑟𝑑𝑎 = 3 𝑝é𝑠, 1 𝑚𝑖𝑙ℎ𝑎 = 1760 𝑗𝑎𝑟𝑑𝑎𝑠 .
Crie um algoritmo que receba uma medida em pés, faça as conversões e
mostre os resultados em: a) Polegadas; b) Jardas; c) Milhas.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a medida em pés: ");
        double pes = sc.nextDouble();
        double polegadas = pes * 12;
        double jardas = pes / 3;
        double milhas = jardas/1760;
        System.out.printf("O resultado da conversão é:%n Polegadas:%.2f%n Jardas:%.2f%n Milhas:%.5f",polegadas,jardas,milhas);
        sc.close();

    }
}
