import java.util.Scanner;

public class Lista2ex03 {
    public static void main(String[] args) {
        /*Crie um algoritmo que leia o nome do aluno, suas 4 notas, calcule a média e
classifique o resultado conforme a tabela abaixo. Ao final, deverão ser
exibidos o nome do aluno, suas 4 notas, sua média e sua classificação. Abaixo de 20 = PÉSSIMO
MAIOR QUE 20 E MENOR QUE 40 = RUIM. Maior que 40 e menor que 60 = Regular.
Maior que 60 e menor que 80 = BOM. ACIMA DE 80 = ÓTIMO.
*/
        int nota1, nota2, nota3, nota4, media;
        String nome, msg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Informe as 4 notas: ");
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();
        nota4 = sc.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media <= 20) {
            msg = "Péssimo";
        } else if (media <= 40) {
            msg = "Ruim";
        } else if (media <= 60) {
            msg = "Regular";
        } else if (media <= 80) {
            msg = "Bom";
        } else {
            msg = "Ótimo";
        }
        System.out.printf("Aluno %s%nNota 1: %d%nNota 2: %d%nNota 3: %d%nNota 4: %d%nMédia equivale a: " +
                "%d%nClassificação da nota: %s", nome, nota1, nota2, nota3, nota4, media, msg);
        sc.close();

    }
}
