package modelo;

import java.io.Serializable;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.br.CPF;

public class Usuario implements Serializable {
	@NotEmpty(message="O nome deve ser informado")
	@Length(max=40,message="O nome nao deve ultrapassar {max} carateres")
	private String nome;
	@NotEmpty(message="A senha deve ser informada")
	@Length(min=6,max=10,message="A senha deve estra entre {min} e {max} carateres")
	private String senha;
	@NotEmpty(message="O cpf deve ser informado")
	@CPF(message="informe um cpf valido")
	private String cpf;
	@NotNull(message="A renda deve ser informada")
	@Digits(fraction=2,integer=10,message="A renda deve ser informada com {integer} digitos na parte inteira e {fraction} digitos na parte fracionaria")
	private Double renda;
	@NotEmpty(message="O email deve ser informado")
	@Email(message="Informe um email valido")
	private String email;
	@NotEmpty(message="A sua pagina pessoal deve ser informada")
	@URL(protocol="http",message="informe um endereco valido")
	private String pagina;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

}
