package br.com.fiap.futuroverde.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Receita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank @Size(min=5, max=100)
	private String nome;
	@NotBlank @Size(min=10,max=500)
	private String ingredientes;
	@NotBlank  @Size(min=10,max=1000)
	private String modoPreparo;
	@NotBlank @Size(min=10, max=200)
	private String imagem;
	
	protected Receita(){
		
	}
	
	public Receita(String nome, String ingredientes, String modoPreparo, String imagem) {
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
