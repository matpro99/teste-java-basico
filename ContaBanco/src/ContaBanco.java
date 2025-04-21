import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Scanner input = new Scanner(System.in);

        double saldo = 237.48;
        
        System.out.println("\nDigite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("\nDigite o número da agência: \nex: 000-0");
        String numeroAgencia = scanner.next();

        System.out.println("\nDigite seu nome completo: ");
        String nomeCliente = input.nextLine();

        System.out.println("\nOlá, "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo de "+saldo+" já está disponível para saque. \n\nAgradecemos a preferência!\n");
    }
}
