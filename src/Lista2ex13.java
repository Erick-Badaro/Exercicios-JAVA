import java.util.Scanner;

public class Lista2ex13 {
    public static void main(String[] args) {
        /*Crie um algoritmo em que o usuário digite seu plano de saúde, e seja exibido o valor da sua respectiva
        mensalidade, de acordo com a tabela abaixo. Caso seja informado um plano inválido, avise o usuário. Tipo do Plano
        Valor do Plano
        Básico R$ 150,00
        Bronze R$ 220,00
        Prata R$ 310,00
        Ouro R$ 450,00 */
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("=====Escolha a opção do seu plano de saúde =====\n1. Básico\n2. Bronze\n3. Prata\n4. Ouro");
        opcao = sc.nextInt();
        if(opcao < 1 || opcao > 4){
            System.err.println("Plano inválido, tente novamente");
            return;
        }
        switch (opcao){
            case 1:
                System.out.println("Você escolheu plano básico, valor da mensalidade é R$ 150,00");
                break;
            case 2:
                System.out.println("Você escolheu plano bronze, valor da mensalidade é R$ 220,00");
                break;
            case 3:
                System.out.println("Você escolheu plano prata, valor da mensalidade é R$ 310,00");
                break;
            default:
                System.out.println("Você escolheu plano ouro, valor da mensalidade é R$ 450,00");
        }
        sc.close();
    }
}
