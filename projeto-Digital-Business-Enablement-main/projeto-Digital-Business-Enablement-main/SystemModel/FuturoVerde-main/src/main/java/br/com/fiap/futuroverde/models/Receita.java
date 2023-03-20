package br.com.fiap.futuroverde.models;

public class Receita {
	
	private String nome;
	private String ingredientes;
	private String modoPreparo;
	private String imagem;
	private int id;
	
	
	public Receita(String nome, String ingredientes, String modoPreparo, String imagem, int Id) {
		this.nome = nome;
		this.ingredientes = ingredientes;
		this.modoPreparo = modoPreparo;
		this.imagem = imagem;
		this.id = id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
    public String toString() {
        return "Nome da receita: " + nome + "Ingredientes: " + ingredientes + "Modo de preparo: " +
    modoPreparo + "Imagem: " + imagem + "Id: " + id;
	}
	

}
