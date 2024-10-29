import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        /*Crie um algoritmo que dados três valores X, Y e Z, verifique se eles podem ser os comprimentos dos lados de um triângulo e, se forem, verifique se é um triângulo equilátero, isósceles ou escaleno. Considere que:
O comprimento de cada lado de um triângulo é menor do que a soma dos outros dois lados;
Chama-se equilátero o triângulo que tem três lados iguais;   Chama-se isósceles o triângulo que tem o comprimento de dois lados
iguais;  Recebe o nome de escaleno o triângulo que tem os três lados diferentes. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de X: ");
        double x = sc.nextDouble();
        System.out.println("Informe o valor de Y: ");
        double y = sc.nextDouble();
        System.out.println("Informe o valor de Z: ");
        double z = sc.nextDouble();
        // Verificando se podem ser comprimentos
        if (x + y > z && x + z > y && y + z > x) {
            System.out.println("Podem ser comprimentos dos lados");
        } else {
            System.err.print("Não podem ser comprimentos dos lados");
            return;
        }
        // Verificando o tipo de triângulo
        if (x == y && y == z) {
            System.out.println("Triângulo equilátero");
        } else if (x == y || y == z || x == z) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
        sc.close();
    }

}
