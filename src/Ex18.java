import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
         /* Pedro comprou um saco de ração com peso em Kg. Ele possui dois gatos,
para os quais fornece a quantidade de ração em gramas. A quantidade diária
de ração fornecida para cada gato é sempre a mesma. Crie um algoritmo que
receba o peso do saco de ração e a quantidade de ração fornecida para cada
gato, calcule e mostre quanto restará de ração no saco após cinco dias. */
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe o peso do saco de ração em kg: ");
        double pesoRacao = sc.nextDouble(); // peso do saco em kg
        System.out.println("Informe a quantidade de ração fornecida para cada gato em gramas: ");
        double qtdRacaoPorGato = sc.nextDouble(); // quantidade de ração por gato em gramas

        // Convertendo o peso do saco de ração de kg para gramas (1 kg = 1000 gramas)
        double pesoRacaoGramas = pesoRacao * 1000;

        // Calculando a quantidade total de ração fornecida por dia (dois gatos)
        double qtdRacaoDiaria = qtdRacaoPorGato * 2;

        // Loop para os 5 dias
        for (int i = 0; i < 5; i++) {
            // Atualizando o peso da ração restante
            pesoRacaoGramas -= qtdRacaoDiaria;
        }

        // Exibindo o resultado final (convertendo de volta para kg)
        double qtdRestanteKg = pesoRacaoGramas / 1000;
        System.out.printf("Após 5 dias, o restante da ração no saco será de: %.2f kg\n", qtdRestanteKg);

        sc.close();
    }
}
