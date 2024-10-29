import java.util.Scanner;

public class Lista2ex15 {
    public static void main(String[] args) {
        // variáveis
        int codPais, codProduto;
        double peso, preco, imposto, valorTotal;
        Scanner sc = new Scanner(System.in);

        // entradas
        System.out.println("Informe o código do país:");
        codPais = sc.nextInt();

        // validar o código do país
        if (codPais < 1 || codPais > 3) {
            System.err.println("Código inválido");
            // encerra o programa
            return;
        }

        System.out.println("Informe o código do produto:");
        codProduto = sc.nextInt();

        // validar o código do produto
        if (codProduto < 1 || codProduto > 10) {
            System.err.println("Código inválido");
            // encerra o programa
            return;
        }

        System.out.println("Informe o peso do produto (Kg):");
        peso = sc.nextDouble();

        // valida o peso
        if (peso <= 0) {
            System.err.println("Peso inválido");
            return;
        }

        // converte o peso para gramas
        peso *= 1000;

        // descobre o preço
        switch (codProduto) {
            case 1, 2, 3, 4 -> preco = 10;
            case 5, 6, 7 -> preco = 25;
            // se cair no default, só pode ser 8, 9 ou 10
            default -> preco = 35;
        }

        // calcula o preço antes do imposto
        preco *= peso;

        // descobre o imposto
        switch (codPais) {
            case 1 -> imposto = 0;
            case 2 -> imposto = 0.15;
            // cair no default, só pode ser 3
            default -> imposto = 0.35;
        }

        // calcula o imposto
        imposto *= preco;

        // calcula o total
        valorTotal = preco + imposto;

        // exibe as informações
        System.out.printf("Peso do produto: %.0fg | Preço: %7.2f | Imposto: %7.2f | Valor Total: %7.2f%n",
                peso, preco, imposto, valorTotal);

        sc.close();
    }
}
