
public class Cliente {

	public String nome; 
	public String rg;
	public String cpf;
	public String end;
	public String tel;
	public int banco;
	private String conta;
	
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	private String senha;
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public static void main(String[]args) {
		
	
	}
	@Override
	public String toString() {
		return "Cliente:" + nome + ", rg: " + rg + ", cpf:" + cpf + ", endereco: " + end + ", telefone: " + tel + ", banco: "
				+ banco + ", conta: " + conta + ", senha: " + senha ;
	}
}
