package br.com.fiap.futuroverde.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor


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
	
	@NotNull
	@ManyToOne
	private Usuario usuario;
	

}
