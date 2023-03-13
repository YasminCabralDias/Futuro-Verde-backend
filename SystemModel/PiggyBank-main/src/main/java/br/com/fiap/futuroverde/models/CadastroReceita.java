package br.com.fiap.futuroverde.models;

public class CadastroReceita {
	
	private String nome;
	private String ingredientes;
	private String modoPreparo;
	private String imagem;
	
	
	public CadastroReceita(String nome, String ingredientes, String modoPreparo, String imagem) {
		this.nome = nome;
		this.ingredientes = ingredientes;
		this.modoPreparo = modoPreparo;
		this.imagem = imagem;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getModoPreparo() {
		return modoPreparo;
	}
	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	@Override
    public String toString() {
        return "Nome da receita: " + nome + "Ingredientes: " + ingredientes + "Modo de preparo: " +
    modoPreparo + "Imagem: " + imagem;
	}
	

}
