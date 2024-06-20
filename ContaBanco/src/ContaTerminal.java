import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Criaremos o input de todos os dados com a classe Scanner.

        Scanner leitor = new Scanner(System.in);

        //Primeiro iremos exibir uma mensagem solicitando ao usuario digitar o que é solicitado.

        System.out.println("Por favor, digite o número da Agência !");
            int numero = leitor.nextInt();
            leitor.nextLine(); //Limpa o buffer de entrada.

        System.out.println("Por favor, digite o código da Agência !");
            String agencia = leitor.nextLine();

        System.out.println("Por favor, digite seu Nome e Sobrenome !");
            String nomeCliente = leitor.nextLine();

        System.out.println("Por favor, digite o Saldo que ira depositar !");
            double saldo = leitor.nextDouble();

        //Por fim iremos imprimir uma mensagem inserindo todos os dados fornecidos pelo usuario.

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+
                agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque.");

        leitor.close(); //Fecha o Scanner no final para liberar recursos.

    }
}
