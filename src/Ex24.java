import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        String mensagem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as 2 notas");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media >= 6) {
            mensagem = "Aluno aprovado\nParabéns";
        } else if (media >= 5) {
            mensagem = "Aluno de recuperação\nAinda há¡ esperança!";
        } else {
            mensagem = "Aluno reprovado\nDeu ruim =(";
        }
        System.out.println(mensagem);
    }
}