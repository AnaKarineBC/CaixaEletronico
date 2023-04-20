import javax.swing.JOptionPane;

public class MenuPrincipal {
	public static void main(String[] args) {

		int op = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer? (1. Cadastrar Clientes; 2. Consultar Conta; 3. Carregar Caixa; 4. Saque; 5. Estat�stica; 6. Finalizar Operacao.): "));
		
		
		switch (op) {
		case 1:
			String login = JOptionPane.showInputDialog("Login Admin: ");
			String senha = JOptionPane.showInputDialog("Senha Admin: ");
			boolean auth = Admin.AutenticAdmin(login,senha);
			if (auth == true) {
				Admin.CadastroCliente();
			} else {
				for (int i = 1; i <= 2; i++) {
					JOptionPane.showMessageDialog(null, "Login ou Senha incorretos! Essa foi a " + i + "� tentativa");
					login = JOptionPane.showInputDialog("Login Admin: ");
					senha = JOptionPane.showInputDialog("Senha Admin: ");
					
				}
				JOptionPane.showMessageDialog(null, "Login ou Senha incorretos! Acao nao autorizada!");
			}
		break;
		case 2:
			login = JOptionPane.showInputDialog("Login Admin: ");
			senha = JOptionPane.showInputDialog("Senha Admin: ");
			auth = Admin.AutenticAdmin(login,senha);
			if (auth == true) {
				Admin.ConsultarCliente();
			} else {
				for (int i = 1; i <= 2; i++) {
					JOptionPane.showMessageDialog(null, "Login ou Senha incorretos! Essa foi a " + i + "� tentativa");
					login = JOptionPane.showInputDialog("Login Admin: ");
					senha = JOptionPane.showInputDialog("Senha Admin: ");
					
				}
				JOptionPane.showMessageDialog(null, "Login ou Senha incorretos! Acao nao autorizada!");
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		}

	}
}
