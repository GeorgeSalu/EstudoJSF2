package controle;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;

public class Uteis {

	public static String getMsg(String messageId){
		FacesContext facesContext = FacesContext.getCurrentInstance();
		String msg = "";
		Locale locale = facesContext.getViewRoot().getLocale();
		ResourceBundle bundle = ResourceBundle.getBundle("messages",locale);
		
		try{
			msg = bundle.getString(messageId);
		}catch(Exception e){
			System.out.println("nao encontrou a mensagem");
		}
		
		return msg;
	}
	
}
