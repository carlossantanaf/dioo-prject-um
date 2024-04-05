import java.util.Scanner;

public class ContaTerminal {
  
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroConta ;
        double  agenciaConta;
        String nomeCliente;
        double saldoConta;

        System.out.println("Bem vindo ao banco, digite os dados para acriação dda coonta");
        System.out.println("Digite o número da coonta:");
        numeroConta = sc.nextInt();
        System.out.println("Digite a agência da coonta:");
        agenciaConta = sc.nextDouble();
        System.out.println("Digite o seu nome:");
        nomeCliente  = sc.next();
        System.out.println("Digite o valor do depósito:");
        saldoConta  = sc.nextDouble();
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é ["+agenciaConta+"], conta número ["+numeroConta+"] e seu saldo é R$"+saldoConta+" já está disponível para saque");

    }

   

}
