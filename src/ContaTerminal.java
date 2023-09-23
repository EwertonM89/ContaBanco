import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        //Solicitações de entrada ao cliente
        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite seu Nome !");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo !");
        double saldoConta = scanner.nextDouble();

        //Exibir mensagem de conta criada
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque");
    }
}
