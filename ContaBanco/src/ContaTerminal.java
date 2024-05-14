import java.util.Scanner;
/*
 * O programa ContaTerminal.java é uma aplicação em Java que permite ao cliente inserir seus dados bancários (número da conta, número da agência, nome e *saldo) através do terminal. Após coletar essas informações usando a classe Scanner, o programa exibe uma mensagem personalizada de boas-vindas *confirmando a criação da conta e informando os detalhes fornecidos. A mensagem final agradece ao cliente e informa que o saldo já está disponível para *saque, proporcionando uma experiência interativa e informativa.
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Insere o Número da Conta e salva na variavél numeroConta
        System.out.println("Por favor, digite o Número da Conta !");
        int numeroConta = sc.nextInt();

        //Insere o Número da Agência e salva na variavél numeroAgencia
        System.out.println("Por favor, digite o Número da Agência !");
        String numeroAgencia = sc.nextLine();

        //Insere o Nome Completo do Cliente e salva na variavél nomeCliente
        System.out.println("Por favor, digite o seu Nome Completo !");
        String nomeCliente = sc.nextLine();

        //Insere o valor do Saldo do Cliente e salva na variavél saldo
        System.out.println("Por favor, digite o seu Saldo1021 !");
        float saldo = sc.nextFloat();
        


        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
