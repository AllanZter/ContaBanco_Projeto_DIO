import java.util.Scanner; // importação Classe Scanner

public class ContaTerminal {
    public static void main(String[] args) {
        // criando objeto Scanner
        Scanner scanner = new Scanner(System.in);
               
        System.out.println("Olá, Vamos criar sua Conta Bancária. Por favor, digite seu nome:");
        String NomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da conta:");
        int Numero = scanner.nextInt();        

        System.out.println("Por favor, digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é  "
         + Agencia + ", conta  " + Numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");      

    }
}
