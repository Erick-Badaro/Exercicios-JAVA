import java.util.Scanner;

public class Lista2ex07 {
    public static void main(String[] args) {
        /*Você foi solicitado a criar um programa para acompanhamento de peso, no
qual através do peso e da altura calcula-se o IMC. Após o cálculo, deverá ser
informada a classificação, conforme tabela abaixo. (IMC = Peso / Altura²)
Menor ou igual a 16 = Magreza Severa
Entre 16 e 17 = Magreza Moderada
Entre 17 e 18.5 = Magreza Leve
Entre 18.5 e 25 = Normal
Entre 25 e 30 = Obesidade Leve
Entre 30 e 40 = Obesidade Severa
Acima de 40 = Obesidade Mórbida
*/
        double peso, altura, imc;
        String msg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o peso: ");
        peso = sc.nextDouble();
        System.out.println("Informe a altura: ");
        altura = sc.nextDouble();


        imc = peso / Math.pow(altura, 2);

        if (imc <= 16) {
            msg = "Magreza severa";
        } else if (imc > 16 && imc <= 17) {
            msg = "Magreza moderada";
        } else if (imc > 17 && imc <= 18.5) {
            msg = "Magreza leve";
        } else if (imc > 18.5 && imc <= 25) {
            msg = "Normal";
        } else if (imc > 25 && imc <= 30) {
            msg = "Obesidade leve";
        } else if (imc > 30 && imc <= 40) {
            msg = "Obesidade severa";
        } else {
            msg = "Obesidade mórbida";
        }
        System.out.printf("Seu peso é: %.0fkg%nSua altura é: %.2fcm%nSeu IMC é: %.2f%nClassificação: %s", peso, altura, imc, msg);
        sc.close();
    }
}
