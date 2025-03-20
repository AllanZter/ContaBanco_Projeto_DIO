import javax.swing.JOptionPane;

public class ContaTerminalJOP {
     public static void main(String[] args) {
        // Solicitando os dados do usuário via JOptionPane
        String nomeCliente = JOptionPane.showInputDialog("Olá, vamos criar sua Conta Bancária. Por favor, digite seu nome:");
        String agencia = JOptionPane.showInputDialog("Por favor, digite o número da Agência:");
        
        String numeroContaStr = JOptionPane.showInputDialog("Por favor, digite o número da conta:");
        int numeroConta = Integer.parseInt(numeroContaStr);
        
        String saldoStr = JOptionPane.showInputDialog("Por favor, digite seu saldo:");
        double saldo = Double.parseDouble(saldoStr);
        
        // Exibindo a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\n" +
                          "Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.";
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
