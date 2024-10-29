import java.util.Random;
import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();

    }

    public static void ex1() {
        /*Crie um algoritmo com a função de exibir todos os números que são divisíveis por 3 entre 50 e 9500. */
        for (int i = 50; i <= 9500; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " É divisível por 3 ");
            }
        }
    }

    public static void ex2() {
        /*Crie um algoritmo que exiba os valores de 1 a 250 e em cada múltiplo de 10 exiba a mensagem:
        “Múltiplo de 10”.*/
        for (int i = 1; i <= 250; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " é múltiplo de 10 ");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void ex3() {
        int soma = 0;
        /*Crie um algoritmo que apresente a soma dos termos da sequência (1 + 2 + 3 + 4 + 5 + 6... + 99 + 100).*/
        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
        }
        System.out.println(soma);
    }

    public static void ex4() {
        /* Complemente o algoritmo criado no exercício 3, solicitando ao usuário até qual termo deverá ser exibida a soma.*/
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
        System.out.println("Informe um número para que seja somado uma sequência: ");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            soma = soma + i;
        }
        System.out.println(soma);
        sc.close();
    }

    public static void ex5() {
        /*Crie um algoritmo que tenha a função de efetuar a soma dos 15 primeiros
termos da sequência. (5,10,15,20...).*/
        int soma = 0;
        int termo;
        for (int i = 1; i <= 15; i++) {
            termo = 5 * i;
            soma = termo + soma;
        }
        System.out.println(soma);
    }

    public static void ex6() {
        /*Complemente o algoritmo do exercício 5, solicitando o primeiro e o último termo da sequência desejada. */
        Scanner scan = new Scanner(System.in);
        int termo1, termo2, soma = 0;
        System.out.println("Informe o primeiro e o último termo: ");
        termo1 = scan.nextInt();
        termo2 = scan.nextInt();

        for (int i = termo1; i <= termo2; i += 5) {
            soma += i;
        }
        System.out.println(soma);

    }

    public static void ex7() {
        /*Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe se que:
        • Esse funcionário foi contratado em 2010, com salário inicial de R$ 1.000,00;
        • Em 2011, ele recebeu aumento de 1,5% sobre seu salário inicial;
        • A partir de 2012 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
        Crie um algoritmo que determine o salário atual desse funcionário. */
        double salarioBase = 1000;
        double aumento = 1.5 / 100;
        for (int ano = 2011; ano <= 2023; ano++) {
            salarioBase += salarioBase * aumento;
            aumento *= 2;
        }
        System.out.printf("O salário atual é: R$ %.2f%n", salarioBase);

    }

    public static void ex8() {
        /*Crie um algoritmo que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário,
        João, tem salário equivalente a 1/3 do salário de Carlos. Carlos aplicará seu salário integralmente em uma
        aplicação que está rendendo 2% ao mês e João aplicará seu salário integralmente em um fundo de renda fixa rendendo
        5% ao mês. O algoritmo deverá calcular e mostar a quantidade de meses necessários para que o valor pertencente a
João iguale ou ultrapasse o valor pertencente a Carlos. */
        Scanner sc = new Scanner(System.in);
        double salarioCarlos;
        System.out.println("Informe o salário do Carlos: ");
        salarioCarlos = sc.nextDouble();
        double salarioJoao = salarioCarlos / 3;
        double rendMensal, rendFixo;
        int meses = 0;
        while (salarioJoao < salarioCarlos) {
            rendFixo = salarioCarlos * 0.02;
            salarioCarlos += rendFixo;
            rendMensal = salarioJoao * 0.05;
            salarioJoao += rendMensal;
            meses++;
        }
        System.out.println("A quantidade necessária de meses para ultrapassar o salário de Carlos é: " + meses);
    }

    public static void ex9() {
        /*Crie um algoritmo que leia valores inteiros diferentes de 0 e exiba as informações abaixo ao ser informado
        o número 0.
        a) A soma dos números positivos;
        b) A quantidade de números negativos.*/
        Scanner sc = new Scanner(System.in);
        int numero;
        int somaPositivos = 0, contagemNegativos = 0;
        do {
            System.out.println("Informe números: ");
            numero = sc.nextInt();
            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                contagemNegativos++;
            }

        } while (numero != 0);
        System.out.println("Soma dos números positivos: " + somaPositivos);
        System.out.println("Quantidade de números negativos: " + contagemNegativos);
    }

    public static void ex10() {
        /*Escreva um algoritmo que receba a nota de um aluno entre 0 e 10 e informe se ele está aprovado
        (maior ou igual a 6), de recuperação (maior ou igual a 5 e menor que 6) ou reprovado (abaixo de 5).
        Caso o valor informado não esteja entre 0 e 10, o algoritmo deverá solicitar novamente o valor até que
esteja no intervalo desejado */
        Scanner sc = new Scanner(System.in);
        int nota;
        String msg;
        do {
            System.out.println("Informe a nota do aluno: ");
            nota = sc.nextInt();
            if (nota >= 6) {
                msg = "Aluno aprovado";
            } else if (nota == 5) {
                msg = "Aluno de recuperação";
            } else {
                msg = "Aluno reprovado";
            }
        }
        while (nota < 0 || nota > 10);
        System.out.println(msg);
    }

    public static void ex11() {
        /*.Crie um algoritmo que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada,
        receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de opção
        inválida e não se preocupe com restrições do tipo salário inválido
        ----- Menu de opções -----
                1. Imposto
                2. Novo salário
                3. Classificação
                4. Finalizar o programa
                Digite a opção desejada.
                Na opção 1, receber o salário de um funcionário, calcular e mostrar o valor
do imposto usando as regras a seguir:
               Menor ou igual a R$ 1500,00 = Imposto 5%
               De R$ 1500,01 a R$ 3000,00 = Imposto 10%
               Acima de R$ 3000,00 = Imposto 15%
               Na opção 2, receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando
               as regras a seguir:
                Maiores que R$ 4.500,00 = Aumento R$ 250,00
                De R$ 3.000,01 a R$ 4.500,00  = Aumento R$ 200,00
                De R$ 2.000,01 a R$ 3.000,00 = Aumento R$ 150,00
                Menores que R$ 2.000,01 = Aumento R$ 130,00
                Na opção 3, receber o salário de um funcionário e mostrar sua classificação usando esta tabela:
                Maiores que R$ 3.000,00 = Classificação Bem Remunerado
                Até R$ 3.000,00 = Classificação Mal Remunerado */
        int opcao;
        double salario, aumento, imposto;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("\n----- Menu de opções -----\n1. Imposto\n2. Novo salário\n3. Classificação\n" +
                    "4. Finalizar o programa\nDigite a opção desejada.");
            opcao = scan.nextInt();
            switch (opcao) {
                // calculando imposto
                case 1:
                    System.out.println("Imposto");
                    System.out.println("Informe o salário do funcionário: ");
                    salario = scan.nextDouble();
                    if (salario <= 1500) {
                        imposto = salario * 0.05;
                    } else if (salario <= 3000) {
                        imposto = salario * 0.10;
                    } else {
                        imposto = salario * 0.15;
                    }
                    System.out.printf("Imposto devido equivale a: R$%.2f", imposto);
                    break;
                // calculando novo salário
                case 2:
                    System.out.println("Cálculo de novo salário: ");
                    System.out.println("Informe o salário do funcionário: ");
                    salario = scan.nextDouble();
                    if (salario > 4500) {
                        aumento = salario + 250;
                    } else if (salario > 3000) {
                        aumento = salario + 200;
                    } else if (salario > 2000) {
                        aumento = salario + 150;
                    } else {
                        aumento = salario + 130;
                    }
                    System.out.printf("Novo salário é: %.2f", aumento);
                    break;
                // classificação do salário
                case 3:
                    System.out.println("Informe o salário do funcionário: ");
                    salario = scan.nextDouble();
                    String classificacao = (salario > 3000 ? "Bem remunerado" : "Mal remunerado");
                    System.out.println(" Classificação " + classificacao);
                    break;
                case 4:
                    System.err.println("Encerrando...");
                    return;
                default:
                    System.err.println("Opção inválida, tente novamente");

            }
        } while (opcao != 4);

    }

    public static void ex12() {
        /*Crie um algoritmo que leia o número de termos, determine e mostre os valores de acordo com a série a seguir:
Série = 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567... */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int n = scanner.nextInt();


        int termo1 = 2;
        int termo2 = 7;
        int razao1 = 3;
        double razao2 = 4.0 / 3;

        System.out.print("Série: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(termo1 + " ");
                termo1 *= razao1;
            } else {
                System.out.print(termo2 + " ");
                // A correção está aqui:
                termo2 = (int) (termo2 * razao2); // Cast para int para manter a sequência
            }


        }
    }

    public static void ex13(){
        /*Em um campeonato de futebol existem cinco times e cada um possui quinze
jogadores. Faça um algoritmo que receba a idade, o peso e a altura de cada
um dos jogadores, calcule e mostre:
• A quantidade de jogadores com idade inferior a 18 anos;
• A média das idades dos jogadores de cada time;
• A média das alturas de todos os jogadores do campeonato;
• O percentual de jogadores com mais de 80 Kg entre todos os jogadores
do campeonato. */
        Random rand = new Random();
        int idade = 0, peso = 0, mediaIdade = 0, mediaAltura = 0;
        int menoresIdade = 0;
        double altura, pessoasMais80 = 0;
        // for do time
        for (int i = 1; i <= 5; i++) {
            // for do jogador
            for (int j = 1; j <= 15; j++) {
                idade = rand.nextInt(16,41);
                peso = rand.nextInt(50, 98);
                altura = rand.nextDouble(1.60,1.99);
                if(idade < 18){
                    menoresIdade++;
                }
                if(peso > 80){
                    pessoasMais80++;
                }
                mediaIdade = idade + mediaIdade;
                mediaAltura = (int) ((double) altura + mediaAltura);

            }
            // media da idade
            mediaIdade = mediaIdade / 15;

            System.out.printf("A média de idade do time %d é: %d%n",i,mediaIdade);


        }
        mediaAltura = mediaAltura / 75;
        mediaAltura = mediaAltura * 100;
        pessoasMais80 = (pessoasMais80 / 75) * 100;
        // exibição
        System.out.printf("A quantidade de jogadores com menos de 18 anos é: %d%nA média de alturas dos jogadores é: %d%nO percentual de jogadores com mais de 80kg é: %.1f",menoresIdade,mediaAltura,pessoasMais80);

    }

    public static void ex14(){
        /*.Elaborar um algoritmo que efetue a leitura de valores positivos inteiros até
que um valor negativo seja informado. Ao final devem ser apresentados o
maior e o menor valor informados pelo usuário.*/
        int numero, maiorValor = 0, menorValor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe números: ");
        numero = sc.nextInt();
        menorValor = numero;
        maiorValor = numero;
        do {
            System.out.println("Informe números: ");
            numero = sc.nextInt();
            if(numero < menorValor && numero > 0){
                menorValor = numero;
            } else if(numero > maiorValor){
                maiorValor = numero;
            }

        } while(numero >=0);
        System.err.println("INVÁLIDO\nENCERRANDO...");
        System.out.println("O menor valor é:" +menorValor);
        System.out.println("O maior valor é: " +maiorValor);
    }

    public static void ex15(){
        /* Elabore um algoritmo que leia 15 valores informados via teclado, e apresente na tela:
       a) O menor número digitado
       b) O maior número digitado
       c) A média dos números digitados
       d) Quantidade de números pares
       e) Quantidade de números divisíveis por 5 */

        Scanner scan = new Scanner(System.in);
        int valor;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        int pares = 0;
        int divisiveisPor5 = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Informe um valor: ");
            valor = scan.nextInt();

            // a) Menor e b) Maior número digitado
            if (valor < menor) {
                menor = valor;
            }
            if (valor > maior) {
                maior = valor;
            }

            // Soma para calcular a média
            soma += valor;

            // d) Contagem de números pares
            if (valor % 2 == 0) {
                pares++;
            }

            // e) Contagem de números divisíveis por 5
            if (valor % 5 == 0) {
                divisiveisPor5++;
            }
        }

        // c) Cálculo da média
        double media = (double) soma / 15;

        // Exibição dos resultados
        System.out.println("Menor número digitado: " + menor);
        System.out.println("Maior número digitado: " + maior);
        System.out.printf("Média dos números digitados: %.2f%n", media);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números divisíveis por 5: " + divisiveisPor5);

    }

    public static void ex16(){
        Scanner scan = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o número de linhas: ");
        int linhas = scan.nextInt();

        System.out.print("Informe o número de colunas: ");
        int colunas = scan.nextInt();

        System.out.print("Deseja pares? (true para pares, false para ímpares): ");
        boolean suprimirPares = scan.nextBoolean();

        int numero = 0; // Começa a contagem dos números a partir de 0

        // Laço para gerar a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if ((numero % 2 == 0 && suprimirPares) || (numero % 2 != 0 && !suprimirPares)) {
                    System.out.print("xx ");
                } else {
                    System.out.printf("%02d ", numero);
                }
                numero++;
            }
            System.out.println(); // Pula para a próxima linha após cada linha completa
        }
    }

}
