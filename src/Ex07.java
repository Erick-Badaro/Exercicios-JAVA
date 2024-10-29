import java.util.Scanner;
public class Ex07 {
    public static void main (String[] args){
        //Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();
        double dobro = numero * 2;
        double terca = numero / 3;
        System.out.println("O dobro de " +numero +" é " + dobro + " , e a terça parte é: " +terca);
        sc.close();
    }
}
