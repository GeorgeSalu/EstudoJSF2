package controle;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@ManagedBean(name = "controleValidacao")
@RequestScoped
public class ControleValidacao implements Serializable {

	@Length(max=40,min=3,message="o nome deve estar entre {min} e {max} caracteres")
	@NotEmpty(message="o nome deve ser informado")
	private String nome;
	@NotEmpty(message="o telefone deve ser informado")
	private String telefone;
	@Email(message="informe um email valido")
	@NotEmpty(message="O email deve ser informado")
	private String email;
	@NotNull(message="A idade deve ser informada")
	@Range(min=12,max=80,message="A idade deve estar entre {min} e {max} anos")
	private Long idade;
	@NotNull(message="A Nota deve ser informada")
	@Range(min=0,max=10,message="A Nota deve estar entre {min} e {max} anos")
	private Double nota;

	public ControleValidacao() {

	}

	public String processaDados(){
		String saida = "";
		saida += "Nome : "+nome;
		saida += "Telefone : "+telefone;
		saida += "Email : "+email;
		saida += "Idade : "+idade;
		saida += "Nota : "+nota;
		FacesMessage msg = new FacesMessage(saida);
		FacesContext.getCurrentInstance().addMessage("", msg);
		
		nome = "";
		telefone = "";
		email = "";
		idade = null;
		nota = null;
		
		return "formValidacao";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

}
