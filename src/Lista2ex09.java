import java.util.Scanner;

public class Lista2ex09 {
    public static void main(String[] args) {
        /*Crie um algoritmo que mostre o menu de opções a seguir, receba a opção do
usuário e os dados necessários para executar cada operação.
**** Menu de Opções *****
1. Somar dois números
2. Raiz quadrada de um número
3. Elevar um número a uma potência
**** Digite a opção desejada **** */
        int opcao, numero1, numero2, soma;
        double resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("====Menu de opções===== ");
        System.out.println("1. Somar dois números\n2.Raiz quadrada de um número\n3. Elevar um número a uma potência\nDigite a opção desejada: ");
        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("VAMOS BRINCAR DE SOMA! Informe dois números: ");
                numero1 = sc.nextInt();
                numero2 = sc.nextInt();
                soma = numero1 + numero2;
                System.out.println("A soma dos números corresponde a: " + soma);
                break;

            case 2:
                System.out.println("Você escolheu raiz quadrada! Informe o número: ");
                numero1 = sc.nextInt();
                resultado = Math.sqrt(numero1);
                System.out.printf("Raiz quadrada do número %d é: %.2f", numero1, resultado);
                break;

            default:
                System.out.println("Você escolheu potência! Informe o número que deseja elevar");
                numero1 = sc.nextInt();
                System.out.println("Informe o número do expoente");
                numero2 = sc.nextInt();
                resultado = Math.pow(numero1, numero2);
                System.out.printf("O resultado da potência corresponde a: %.0f", resultado);
        }
        sc.close();

    }
}
