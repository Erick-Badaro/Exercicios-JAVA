import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        int codProduto, pesoKG, pesoGramas, codPais;
        double imposto, valorTotal, preco;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o código do produto(de 1 a 4)");
        codProduto = sc.nextInt();
        System.out.println("Informe o peso do produto em KG: ");
        pesoKG = sc.nextInt();
        System.out.println("Informe o código do país(de 1 a 3)");
        codPais = sc.nextInt();
        pesoGramas = pesoKG * 1000;
        switch(codProduto){
            case 1,
                 2,
                 3,
                 4: preco = 10;
            break;
            case 5,
                 6,
                 7: preco = 25;
            break;
            default: preco = 35;
        }
        preco *= pesoGramas;
        switch(codPais){
            case 1: imposto = 0;
            break;
            case 2: imposto = 0.15;
            break;
            default: imposto = 0.25;
        }
        imposto *= preco;
        valorTotal = preco + imposto;
        System.out.printf("Peso em gramas: %dg | Preço total do produto: %7.2fR$ | Valor do imposto: %7.2fR$| Preço Total: %7.2fR$",pesoGramas,preco,imposto,valorTotal);
        sc.close();
    }
}
