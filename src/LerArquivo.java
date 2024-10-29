import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) {
        File login = new File("C:/Users/Pichau/Downloads/erickbadaro.txt");
        String usuarioCorreto = "";
        String senhaCorreta = "";
        int tentativas = 0;
        try {
            Scanner scan = new Scanner(login);
            if(scan.hasNextLine()){
                usuarioCorreto = scan.nextLine();
            }
            if(scan.hasNextLine()){
                senhaCorreta = scan.nextLine();
            }
            scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner teclado = new Scanner(System.in);
        boolean loginBemSucedido = false;
        do {
            System.out.println("Informe o usuário: ");
            String usuario = teclado.nextLine();
            System.out.println("Informe a senha: ");
            String senha = teclado.nextLine();
            if(usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)){
                System.out.println("Login realizado");
                loginBemSucedido = true;
                break;
            } else{
                tentativas++;
                System.err.println("Usuário ou senha incorretos");
            }
        } while(tentativas <= 5 && !loginBemSucedido);

        if(!loginBemSucedido){
            System.err.println("Número de tentativas excedido. Encerrando...");
        }
        teclado.close();
    }
}
