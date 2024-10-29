import java.util.Scanner;

public class Lista2ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Passo 1: Definir variáveis e coletar os dados
        String placa;
        int horaEntr, minutoEntr, horaSai, minutoSai;
        boolean vagaCoberta;

        System.out.println("=== BEM-VINDO AO FELIZ PARK ===");

        // Coletar a placa
        System.out.print("Informe a placa do veículo: ");
        placa = sc.nextLine();

        // Coletar hora e minuto de entrada
        System.out.print("Informe a hora e minuto de entrada (hh mm): ");
        horaEntr = sc.nextInt();
        minutoEntr = sc.nextInt();

        // Coletar hora e minuto de saída
        System.out.print("Informe a hora e minuto de saída (hh mm): ");
        horaSai = sc.nextInt();
        minutoSai = sc.nextInt();

        // Perguntar se é vaga coberta
        System.out.print("A vaga é coberta? (true para sim / false para não): ");
        vagaCoberta = sc.nextBoolean();

        // Passo 2: Validar os horários
        if (horaEntr < 6 || horaEntr > 21 || minutoEntr < 0 || minutoEntr > 59 ||
                horaSai < 6 || (horaSai == 22 && minutoSai > 0) || horaSai > 22 || minutoSai < 0 || minutoSai > 59) {
            System.err.println("Dados inválidos! O horário de funcionamento é das 06:00 às 22:00.");
            return;
        }

        // Passo 3: Calcular o tempo total em minutos
        int totalMinutosEntrada = horaEntr * 60 + minutoEntr;
        int totalMinutosSaida = horaSai * 60 + minutoSai;

        // Se a saída for no dia seguinte, adicionar 24 horas (1440 minutos)
        if (totalMinutosSaida < totalMinutosEntrada) {
            totalMinutosSaida += 24 * 60;
        }

        int duracaoTotalMinutos = totalMinutosSaida - totalMinutosEntrada;

        // Passo 4: Calcular o valor a ser pago
        double valorPorMinuto = 7.0 / 60.0;  // Valor por minuto é R$ 0,1167
        double valorTotal = 0;

        // Se o veículo ficou menos de 10 minutos, não há cobrança
        if (duracaoTotalMinutos < 10) {
            valorTotal = 0;
        } else {
            // Calcular o valor total com base nos minutos
            valorTotal = duracaoTotalMinutos * valorPorMinuto;

            // Aplicar o valor mínimo de 1 hora e o máximo de 5 horas
            if (duracaoTotalMinutos < 60) {
                valorTotal = 7.0;  // Mínimo de 1 hora
            } else if (duracaoTotalMinutos > 300) {
                valorTotal = 35.0; // Máximo de 5 horas
            }
        }

        // Passo 5: Aplicar o acréscimo de 20% para vagas cobertas
        if (vagaCoberta) {
            valorTotal += valorTotal * 0.20;  // Acréscimo de 20%
        }

        // Passo 6: Emitir o recibo
        int duracaoHoras = duracaoTotalMinutos / 60;
        int duracaoMinutos = duracaoTotalMinutos % 60;

        System.out.println("\n=== RECIBO ===");
        System.out.printf("Placa: %s\n", placa);
        System.out.printf("Entrada: %02d:%02d\n", horaEntr, minutoEntr);
        System.out.printf("Saída: %02d:%02d\n", horaSai, minutoSai);
        System.out.printf("Tempo estacionado: %d horas e %d minutos\n", duracaoHoras, duracaoMinutos);
        System.out.printf("Valor a ser pago: R$ %.2f\n", valorTotal);

        sc.close();
    }
}
