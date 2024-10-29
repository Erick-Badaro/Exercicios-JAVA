import java.util.Scanner;

public class Lista2ex08 {
    public static void main(String[] args) {
        /*Crie um algoritmo que dados três valores X, Y e Z, verifique se eles podem
ser os comprimentos dos lados de um triângulo e, se forem, verifique se é um
triângulo equilátero, isósceles ou escaleno. Considere que:
• O comprimento de cada lado de um triângulo é menor do que a soma
dos outros dois lados;
• Chama-se equilátero o triângulo que tem três lados iguais;
• Chama-se isósceles o triângulo que tem o comprimento de dois lados
iguais;
• Recebe o nome de escaleno o triângulo que tem os três lados
diferentes. */
        int x, y, z;
        String msg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de X: ");
        x = sc.nextInt();
        System.out.println("Informe o valor de Y: ");
        y = sc.nextInt();
        System.out.println("Informe o valor de Z: ");
        z = sc.nextInt();

        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                msg = "O Triângulo é equilátero";
            } else if (x == y || y == z || x == z) {
                msg = "O Triângulo é isósceles";
            } else {
                msg = "O Triângulo é escaleno";
            }
            System.out.println(msg);
        } else {
            msg = "Os valores informados não formam um triângulo.";
            System.err.println(msg);
        }
        sc.close();

    }
}
