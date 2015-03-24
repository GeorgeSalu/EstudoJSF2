package modelo;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Pessoa implements Serializable {
	
	private Integer id;
	@NotEmpty(message="O nome deve se informado")
	@Length(max=40,message="O nome nao deve ser maior que {max} caracteres")
	private String nome;
	@Email(message="informe um email valido")
	private String email;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
