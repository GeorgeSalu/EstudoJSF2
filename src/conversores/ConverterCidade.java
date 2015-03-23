package conversores;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import controle.Cidade;

public class ConverterCidade implements Converter{
	
	private List<Cidade> cidades;
	
	public ConverterCidade(List<Cidade> lista) {
		this.cidades = lista;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String string) {
		Cidade retorno = null;
		for(Cidade c: cidades){
			if(c.getCodigo().equals(Integer.parseInt(string))){
				retorno = c;
			}
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
		if(obj == null){
			return null;
		}
		Cidade retorno = (Cidade) obj;
		return retorno.getCodigo().toString();
	}
	
	
}
