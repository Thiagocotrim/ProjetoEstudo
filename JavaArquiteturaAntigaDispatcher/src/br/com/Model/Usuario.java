package br.com.Model;

public class Usuario {

	private String nome;
	private String password;
	private String botao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBotao() {
		return botao;
	}
	public void setBotao(String botao) {
		this.botao = botao;
	}
	@Override
	public String toString() {
		return "usuario [nome=" + nome + ", password=" + password + ", botao=" + botao + "]";
	}
	
	
	
}
