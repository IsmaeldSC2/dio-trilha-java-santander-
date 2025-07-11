import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agencia! ");
         agencia = leitura.nextLine();

        System.out.println("Informe o numero da sua conta: ");
         numero = leitura.nextInt();
         leitura.nextLine();

        System.out.println("Por favor, informe o seu nome: ");
         nomeCliente = leitura.nextLine();


        System.out.println("Por favor, informe o seu saldo: ");
         saldo = leitura.nextDouble();

        System.out.println("Olá," + nomeCliente + ",o numero da sua conta é " + numero +
                ",obrigado por criar uma conta em nosso banco, sua agencia é" + agencia +
                ", o seu saldo é" + saldo + ",já está disponivel para saque");




    }
}