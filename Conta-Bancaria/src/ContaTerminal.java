import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Dados coletados pela máquina através do terminal
        System.out.println("Digite o número da Agência!");
        int agencia = scanner.nextInt();
        
        System.out.println("Digite o número da conta!");
        String conta = scanner.next();

        System.out.println("Digite seu nome!");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome!");
        String sobrenome = scanner.next();
        
        System.out.println("Digite o saldo da conta!");
        double saldo = scanner.nextDouble();

        // Dados mostrados ao Usuário pelo terminal
        System.out.println("Ola " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + "e seu saldo " + saldo + " já está disponível para saque");
    }
}
