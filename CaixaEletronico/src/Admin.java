import javax.swing.JOptionPane;

public class Admin {
	
	private static String loginAdmin = "Ana";
	private static String senhaAdmin = "123!";

	public static void main(String[] args) {
		
	}
	public static boolean AutenticAdmin(String login, String senha) {
		boolean auth;
		if (login.equals(loginAdmin) && senha.equals(senhaAdmin)) {
			auth = true;
		} else {
			auth = false;
		}
		return auth;
	}

	public static void CadastroCliente() {
		JOptionPane.showMessageDialog(null, "Cadastro do cliente autorizado!");
		Cliente cliente = new Cliente();
		cliente.nome = JOptionPane.showInputDialog("Nome do cliente: ");
		cliente.rg = JOptionPane.showInputDialog("RG do cliente: ");
		cliente.cpf = JOptionPane.showInputDialog("CPF do cliente: ");
		cliente.end = JOptionPane.showInputDialog("Endereco do cliente: ");
		cliente.tel = JOptionPane.showInputDialog("Telefone do cliente: ");
		cliente.banco = Integer.parseInt(JOptionPane.showInputDialog("Banco do cliente (1 -Itaú; 2 -Santander; 3 -Bradesco; 4-HSBC): "));
		cliente.setConta(JOptionPane.showInputDialog("Conta do cliente: "));
		cliente.setSenha(JOptionPane.showInputDialog("Senha do cliente: "));
		JOptionPane.showMessageDialog(null, cliente.toString());
	}
	
	public static void ConsultarCliente() {
		
	}
}
