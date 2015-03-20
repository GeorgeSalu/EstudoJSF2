package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="controlePrincipal")
@SessionScoped
public class ControlePrincipal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1960369127474814329L;
	
	private String mensagem;

	public ControlePrincipal() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
		mensagem = "Este Bean foi criado no momento "+sdf.format(Calendar.getInstance().getTime());
	}
	
	public String sobre(){
		mensagem = "Voce foi redirecionado de maneira dinamica";
		return "sobre";
	}
	
	public String sobreRedirecionada(){
		mensagem = "Voce foi redirecionada para a pagina sobre.xhtml";
		return "sobre?faces-redirect=true";
	}
	

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
