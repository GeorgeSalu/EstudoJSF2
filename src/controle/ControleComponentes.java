package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controleComponentes")
@SessionScoped
public class ControleComponentes implements Serializable {

	private String texto;

	public ControleComponentes() {
	}

	public String geraTexto() {
		texto = "Texto gerado : <> <b>Texto em negrito</b>";
		return "componentesParte2";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
