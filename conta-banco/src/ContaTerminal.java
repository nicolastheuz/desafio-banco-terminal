import java.util.Scanner; //Importação do scanner
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //Colocar o Scanner no código
       var Scanner = new Scanner(System.in);
       System.out.println("Informe sua agência ");
       var agencia = Scanner.next();
       System.out.println("Digite o Número da conta ");
       var conta = Scanner.next();
       System.out.println("Digite o seu nome ");
       var nome_cliente = Scanner.next();
        double saldo = 12.500;
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.3f já está disponível para saque", nome_cliente, agencia, conta, saldo);


    }
}
