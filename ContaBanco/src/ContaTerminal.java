import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = sc.nextLine();

        System.out.println("Por favor, digite o seu Nome Completo !");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu Saldo1021 !");
        float saldo = sc.nextFloat();
        


        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
