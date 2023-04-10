package br.com.fiap.futuroverde.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	//@Column(name = "id_usuario")
	private Integer id;
	@NotBlank @Size(min=5, max=100)
	private String nome;
	@NotBlank @Email
	private String email;
	@NotBlank @Size(min=6, max=20)
	@JsonProperty(access = Access.WRITE_ONLY)
	private String senha;
	
	
	
			
}
