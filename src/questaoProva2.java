import java.util.Scanner;

public class questaoProva2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto, qtd, estado;
        double frete;
        System.out.println("===Programa de cálculo de frete===");
        System.out.println("Selecione o produto:\n1. A001 – Mouse Óptico USB sem fio\n2. A002 – SSD 480GB\n3. A003 – Adaptador wireless USB 3.0\n4. A004 – Pen Drive 32GB\n5. A005 – Webcam Full HD ");
        produto = sc.nextInt();
        switch (produto) {
            case 1:
                System.out.println("Você escolheu: Mouse Óptico USB sem fio ");
                produto = 42;
                break;
            case 2:
                System.out.println("Você escolheu: SSD 480GB ");
                produto = 300;
                break;
            case 3:
                System.out.println("Você escolheu: Adaptador wireless USB 3.0 ");
                produto = 95;
                break;
            case 4:
                System.out.println("Você escolheu: Pen Drive 32GB");
                produto = 30;
                break;
            case 5:
                System.out.println("Você escolheu: Webcam Full HD ");
                produto = 229;
                break;
            default:
                System.err.println("Opção Inválida");
                return;
        }
        System.out.println("Quantos destes você deseja? ");
        qtd = sc.nextInt();
        if (qtd < 1 || qtd > 12) {
            System.err.println("QUANTIDADE INVÁLIDA");
            return;
        }

        int valorTotalProduto = produto * qtd;

        System.out.println("Para qual estado deseja que o produto seja enviado? 1. Rio Grande do Sul\n2. São Paulo\n3. Brasilia\n4.Salvador\n5. Manaus ");
        estado = sc.nextInt();
        frete = 0;
        switch (estado) {
            case 1:
                frete = valorTotalProduto * 0.09;
                break;
            case 2:
                frete = valorTotalProduto * 0.07;
                break;
            case 3:
                frete = valorTotalProduto * 0.11;
                break;
            case 4:
                frete = valorTotalProduto * 0.14;
                break;
            case 5:
                frete = valorTotalProduto * 0.18;
                break;
            default:
                System.err.println("OPÇÃO INVÁLIDA");
                return;
        }

        System.out.println("Selecione o tipo de embalagem:\n1. Caixa de papelão grande comum \n2. Caixa de papelão grande triplex\n3. Plástico bolha\n4. Saco plástico");
        int embalagem = sc.nextInt();
        double precoEmbalagem = 0;
        switch (embalagem) {
            case 1:
                precoEmbalagem = 12;
                break;
            case 2:
                precoEmbalagem = 22;
                break;
            case 3:
                precoEmbalagem = 14;
                break;
            case 4:
                precoEmbalagem = 7;
                break;
            default:
                System.err.println("OPÇÃO INVÁLIDA");
                return;
        }

        System.out.println("Deseja incluir seguro? 1 - SIM / 2- NÃO");
        int seguro = sc.nextInt();
        double adicional = 0;
        if (seguro == 1) {
            adicional += 0.07;
        }

        System.out.println("Deseja incluir rastreamento? 1 - SIM / 2- NÃO");
        int rastreamento = sc.nextInt();
        if (rastreamento == 1) {
            adicional += 0.04;
        }

        System.out.println("Deseja incluir uma escolta armada? 1 - SIM / 2- NÃO");
        int escolta = sc.nextInt();
        if (escolta == 1) {
            adicional += 0.12;
        }

        double valorAdicional = valorTotalProduto * adicional;
        double resultado = frete + precoEmbalagem + valorAdicional;

        System.out.printf("O valor total do produto que você escolheu é R$: %d%nO valor do frete é R$: %.2f%nO valor da embalagem é R$: %.2f%nO valor cobrado pelos adicionais é R$: %.2f%nPor fim, o valor final do frete é R$: %.2f ", valorTotalProduto, frete, precoEmbalagem, valorAdicional, resultado);
        sc.close();
    }
}
