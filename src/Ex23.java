import java.util.Scanner;

public class Ex23 {
    /*
     * Crie um algoritmo que leia o nome do aluno, suas 4 notas,
     * calcule a média e classifique o resultado conforme a tabela abaixo.
     * Ao final, deverão ser exibidos o nome do aluno, suas 4 notas, sua média e sua classificação.
     * Abaixo de 20 (inclusive)	Péssimo
     * Maior que 20 e menor que 40 (inclusive)	Ruim
     * Maior que 40 e menor que 60 (inclusive)	Regular
     * Maior que 60 e menor que 80 (inclusive)	Bom
     * Acima de  80	ótimo */
    public static void main(String[] args) {
        // variáveis
        int nota1, nota2, nota3, nota4, media;
        String nomeAluno, classif;
        Scanner sc = new Scanner(System.in);
        // entrada de dados
        System.out.println("Informe o nome do aluno");
        nomeAluno = sc.nextLine();
        System.out.println("Informe as 4 notas do aluno (0 a 100)");
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();
        nota4 = sc.nextInt();
        // validar as notas
        if (nota1 < 0 || nota1 > 100
                || nota2 < 0 || nota2 > 100
                || nota3 < 0 || nota3 > 100
                || nota4 < 0 || nota4 > 100) {
            System.err.print("DADOS INVÁLIDOS. Encerrando...");
            System.exit(0);
        }
        // calcula a média
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        // define a classificação
        if (media <= 20) {
            classif = "Péssima";
        } else if (media <= 40) {
            classif = "Ruim";
        } else if (media <= 60) {
            classif = "Regular";
        } else if (media <= 80) {
            classif = "Boa";
        } else {
            classif = "Ótimo";
        }
        System.out.printf
                ("%s suas notas foram:%n%3d%n%3d%n%3d%n%3d%nSua média é %3d e é classificada como %s",
                        nomeAluno, nota1, nota2, nota3, nota4, media, classif);
    }

}
