import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Crie um algoritmo que receba os valores de 𝑎, 𝑏 𝑒 𝑐 e calcule a equação de
segundo grau formada por 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0. */
        System.out.println("***CÁLCULO DE EQUAÇÃO DE 2°GRAU***");
        System.out.println("Informe o valor de a: ");
        int a = sc.nextInt();
        System.out.println("Informe o valor de b: ");
        int b = sc.nextInt();
        System.out.println("Informe o valor de c: ");
        int c = sc.nextInt();
        double delta = Math.pow(b,2) - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes da equação são x1 = %.2f e x2 = %.2f ", x1,x2);
        } else if (delta ==0){
            double x = -b / ( 2.0 * a);
            System.out.printf("A equação tem uma única raiz real: x = %.2f", x);
        }
            else {
                System.out.println("A equação não tem raízes reais.");
            }
        }

    }

