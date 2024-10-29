import java.util.Scanner;

public class Lista2ex14 {
    public static void main(String[] args) {
        /*4. Um vendedor precisa de um algoritmo que calcule o preço total devido por um cliente. O algoritmo deve
        receber o código de um produto, a quantidade comprada e calcular o preço total de acordo com a tabela abaixo.
        Mostre uma mensagem no caso de código inválido.
         A001 R$ 7,50
         A002 R$ 9,90
         A003 R$ 14,00
         A004 R$ 19,99 */
        Scanner sc = new Scanner(System.in);
        String codProduto;
        int qtdProduto;
        double valorTotal;
        System.out.println("Informe o código do produto: ");
        codProduto = sc.nextLine();
        if (!codProduto.equalsIgnoreCase("A001") && !codProduto.equalsIgnoreCase("A002") && !codProduto.equalsIgnoreCase("A003")
                && !codProduto.equalsIgnoreCase("A004")) {
            System.err.println("CÓDIGO INVÁLIDO");
            return;
        }

        System.out.println("Informe a quantidade comprada: ");
        qtdProduto = sc.nextInt();


        if (codProduto.equalsIgnoreCase("A001")) {
            valorTotal = qtdProduto * 7.50;
            System.out.printf("O cliente deve pagar no total R$: %.2f", valorTotal);
        } else if (codProduto.equalsIgnoreCase("A002")) {
            valorTotal = qtdProduto * 9.90;
            System.out.printf("O cliente deve pagar no total R$: %.2f", valorTotal);
        } else if (codProduto.equalsIgnoreCase("A003")) {
            valorTotal = qtdProduto * 14;
            System.out.printf("O cliente deve pagar no total R$: %.2f", valorTotal);
        } else {
            valorTotal = qtdProduto * 19.99;
            System.out.printf("O cliente deve pagar no total R$: %.2f", valorTotal);
        }
        sc.close();
    }
}
