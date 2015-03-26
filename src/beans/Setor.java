package beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Index;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="SETOR")
public class Setor implements Serializable {

	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "SEQ_SETOR", sequenceName = "SEQ_SETOR_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SETOR")
	private Integer id;
	@NotEmpty(message="O nome deve ser informado")
	@Length(max=50,message="O nome nao pode ultrapassar {max} caracteres")
	@Column(name="NOME",length=50,nullable=false)
	@Index(name="IDX_SETOR_NOME")
	private String nome;

	public Setor() {
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

	@Override
	public String toString() {
		return nome;
	}

	
	
}
