package controle;

public class Cidade {

	private Integer codigo;
	private String nome;
	private String uf;

	public Cidade() {
		// TODO Auto-generated constructor stub
	}
	
	public Cidade(Integer codigo, String nome, String uf) {
		this.codigo = codigo;
		this.nome = nome;
		this.uf = uf;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String toString(){
		return nome;
	}
	
}
