/******************************************************************************
EXERCÍCIO 02
Desenvolva um programa em Java que simule um sistema de login simples para uma 
conta corrente. O programa deve:Solicitar ao usuário que insira um nome de
usuário e senha.Comparar o nome de usuário e senha inseridos com um nome de 
usuário e senha predefinidos.Permitir que o usuário tente fazer login no máximo 
3 vezes.Exibir uma mensagem de sucesso se o login for bem-sucedido ou uma 
mensagem de erro se o login falhar após 3 tentativas.
*******************************************************************************/
import java.util.Scanner;

public class SistemaDeLogin {
    public static void main(String[] args) {

        String usuarioPredefinido = "usuario123";
        String senhaPredefinida = "senha@123";
        Scanner scanner = new Scanner(System.in);
        // Processamento
        String usuario;
        String senha;
        int tentativas = 0;
        boolean loginBemSucedido = false;
        
        // Entre com o nome e a senha. máximo 3x
        for (tentativas = 0; tentativas < 3; tentativas++) {
            System.out.print("Digite o nome de usuário: ");
            usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
            // Identificar se as informações estão corretas
            if (usuario.equals(usuarioPredefinido) && senha.equals(senhaPredefinida)) {
                loginBemSucedido = true;
                break; 
            } else {
                System.out.println("Login falhou. Você tem " + (2 - tentativas) + " tentativa(s) restante(s).");
            }
        }
        // Saída de dados
        if (loginBemSucedido) {
            System.out.println("Login bem-sucedido! Bem-vindo à sua conta corrente.");
        } else {
            System.out.println("Você atingiu o número máximo de tentativas. Acesso bloqueado.");
        }
    }
}
