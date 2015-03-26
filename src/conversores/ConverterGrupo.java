package conversores;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import beans.Grupo;
import jpa.EntityManagerUtil;

public class ConverterGrupo implements Converter,Serializable{

	//converte da tela para o objeto
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String string) {
		if(string == null || string.equals("Selecione um grupo")){
			return null;
		}
		return EntityManagerUtil.getEntityManager().find(Grupo.class, Integer.parseInt(string));
	}

	//converte do objeto para tela
	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object o) {
		if(o == null){
			return null;
		}
		Grupo obj = (Grupo) o;
		return obj.getId().toString();
	}

}
