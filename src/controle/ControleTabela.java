package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controleTabela")
@SessionScoped
public class ControleTabela implements Serializable {

	private List<Pessoa> lista;

	public ControleTabela() {
		lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa(1, "Joao 1", "(99) 9999-9999"));
		lista.add(new Pessoa(2, "Joao 2", "(99) 9999-9999"));
		lista.add(new Pessoa(3, "Joao 3", "(99) 9999-9999"));
		lista.add(new Pessoa(4, "Joao 4", "(99) 9999-9999"));
		lista.add(new Pessoa(5, "Joao 5", "(99) 9999-9999"));
		lista.add(new Pessoa(6, "Joao 6", "(99) 9999-9999"));
		lista.add(new Pessoa(7, "Joao 7", "(99) 9999-9999"));
		lista.add(new Pessoa(8, "Joao 8", "(99) 9999-9999"));
		lista.add(new Pessoa(9, "Joao 9", "(99) 9999-9999"));
	}

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

}
