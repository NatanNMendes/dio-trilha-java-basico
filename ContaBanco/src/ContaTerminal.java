import java.util.Scanner;
/*
 * O programa ContaTerminal.java é uma aplicação em Java que permite ao cliente inserir seus dados bancários (número da conta, número da agência, nome e *saldo) através do terminal. Após coletar essas informações usando a classe Scanner, o programa exibe uma mensagem personalizada de boas-vindas *confirmando a criação da conta e informando os detalhes fornecidos. A mensagem final agradece ao cliente e informa que o saldo já está disponível para *saque, proporcionando uma experiência interativa e informativa.
 */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os dados do cliente
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente
        
        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu Saldo:");
        float saldo = scanner.nextFloat();
        
        // Exibe a mensagem de confirmação e retorna os dados informados anteriormente
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

