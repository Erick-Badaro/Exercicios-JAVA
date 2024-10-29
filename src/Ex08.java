import java.util.Scanner;
public class Ex08 {
    public static void main (String[] args){
        /* Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma distância em metros: ");
        double metros = sc.nextDouble();
        double km = metros / 1000;
        double hm = metros / 100;
        double dam = metros / 10;
        double dm = metros * 10;
        double cm = metros * 100;
        double mm = metros * 1000;

        System.out.println("A distância em metros corresponde a: ");
        System.out.println(km + "km");
        System.out.println(hm + "hm");
        System.out.println(dam + "dam");
        System.out.println(dm + "dm");
        System.out.println(cm + "cm");
        System.out.println(mm + "mm");

    }
}
