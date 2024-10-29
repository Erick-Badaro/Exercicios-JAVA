import java.util.Scanner;

public class Ex10 {
    public static void main (String[] args){
        /*  Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.  */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura da parede: ");
        double larg = sc.nextDouble();
        System.out.println("Digite a altura da parede: ");
        double alt = sc.nextDouble();
        double area = larg * alt;
        System.out.println("Área corresponde a " +area);
        double resultado = area/2;
        System.out.println("A quantidade de tinta necessária para pintar a área é: " + resultado + " litros ");
        sc.close();

    }
}
