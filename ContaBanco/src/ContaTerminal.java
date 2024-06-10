import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usaurio

        //Obter pela classe Scanner os valores digitados no terminal 

        System.out.println("Por favor, digite o numero da Conta ");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("insira seu saldo atual: ");
        float saldo = scanner.nextFloat();

        nome = (nome + " " + sobrenome);

        //Exibir a mensagem final da conta criada

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque");



    }
}
