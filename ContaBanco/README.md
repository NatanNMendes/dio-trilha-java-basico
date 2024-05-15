
# ContaTerminal.java
_By Natan Nunes Mendes_

[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/NatanNMendes)
[![Perfil DIO](https://img.shields.io/badge/-Meu%20Perfil%20na%20DIO-3333FF?style=for-the-badge&logo=gitbook&logoColor=white)](https://www.dio.me/users/natan_nunes_mendes_95684)

- `ContaBanco`/`src`/`ContaTerminal.java`

### Descrição

O `ContaTerminal.java` é uma aplicação simples de terminal em Java que permite a um cliente inserir suas informações bancárias e recebe uma mensagem de confirmação personalizada.

### Funcionalidades

O programa solicita ao cliente os seguintes dados:

- Número da Conta (inteiro)
- Número da Agência (texto)
- Nome do Cliente (texto)
- Saldo (decimal)

Depois que o cliente insere esses dados, o programa exibe uma mensagem de boas-vindas, confirmando a criação da conta e informando os detalhes fornecidos pelo cliente.

### Implementação

```java
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu Saldo:");
        float saldo = scanner.nextFloat();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
```

### Explicação

**Importação e Inicialização**

- Importa a classe `Scanner` para ler a entrada do usuário.

- Cria uma instância do `Scanner` para capturar os dados do cliente a partir da entrada padrão (teclado).

**Leitura dos Dados**

- Solicita e lê o número da conta como um inteiro.

- Lê o número da agência como uma string.

- Lê o nome do cliente como uma string.

- Lê o saldo como um número decimal (float).

**Exibição da Mensagem**

- Utiliza os dados capturados para compor uma mensagem de confirmação personalizada e a exibe ao cliente.

- Encerramento do Scanner

- Fecha o scanner para liberar os recursos associados a ele.

### Exemplo de Execução

Quando o programa é executado, ele solicita ao cliente que insira os dados necessários e, em seguida, exibe uma mensagem como esta:

```plaintext
Por favor, digite o número da Conta:
1021
Por favor, digite o número da Agência:
067-8
Por favor, digite o seu Nome:
MARIO ANDRADE
Por favor, digite o seu Saldo:
237.48
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

Este programa é um exemplo básico de como capturar e utilizar dados de entrada do usuário em Java, e como formatar uma mensagem de saída personalizada.

### Requisitos

- JDK 8 ou superior.

### Requisitos

1. Certifique-se de ter o JDK instalado.

2. Compile o programa usando o comando:

```sh
javac ContaTerminal.java
```

3. Execute o programa usando o comando:

```sh
java ContaTerminal
```

4. Siga as instruções na tela para inserir os dados solicitados.

### Licença

Este projeto é de domínio público e pode ser usado livremente para fins educacionais e comerciais.

### Autor

- Desenvolvido por [Natan Nunes Mendes](https://github.com/NatanNMendes).