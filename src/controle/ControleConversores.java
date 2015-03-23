package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import conversores.ConverterCidade;

@ManagedBean(name = "controleConversores")
public class ControleConversores implements Serializable {

	private Calendar nascimento;
	private Cidade cidade;
	private List<Cidade> listaCidade = new ArrayList<Cidade>();
	private ConverterCidade converterCidade;

	public ControleConversores() {
		nascimento = Calendar.getInstance();
		listaCidade.add(new Cidade(1, "cidade 1", "sp"));
		listaCidade.add(new Cidade(2, "cidade 1", "rj"));
		listaCidade.add(new Cidade(3, "cidade 3", "pa"));
		converterCidade = new ConverterCidade(listaCidade);
	}

	public String lerDados() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		FacesMessage msg = new FacesMessage("Informe uma data valida");
		if (nascimento != null && cidade != null) {
			msg = new FacesMessage("Nascimento : "
					+ sdf.format(nascimento.getTime()));
		}
		FacesContext.getCurrentInstance().addMessage("", msg);
		nascimento = null;
		return "formConversores";
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getListaCidade() {
		return listaCidade;
	}

	public void setListaCidade(List<Cidade> listaCidade) {
		this.listaCidade = listaCidade;
	}

	public ConverterCidade getConverterCidade() {
		return converterCidade;
	}

	public void setConverterCidade(ConverterCidade converterCidade) {
		this.converterCidade = converterCidade;
	}

	
	
}
