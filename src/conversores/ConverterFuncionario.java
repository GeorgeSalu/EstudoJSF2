package conversores;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import beans.Funcionario;
import beans.Grupo;
import beans.Setor;
import jpa.EntityManagerUtil;

public class ConverterFuncionario implements Converter,Serializable{

	//converte da tela para o objeto
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String string) {
		if(string == null || string.equals("Selecione um Funcionario")){
			return null;
		}
		return EntityManagerUtil.getEntityManager().find(Funcionario.class, Integer.parseInt(string));
	}

	//converte do objeto para tela
	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object o) {
		if(o == null){
			return null;
		}
		Funcionario obj = (Funcionario) o;
		return obj.getId().toString();
	}

}
