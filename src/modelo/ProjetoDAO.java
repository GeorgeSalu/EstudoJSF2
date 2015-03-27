package modelo;

import java.util.List;

import javax.persistence.EntityManager;

import util.UtilErros;
import util.UtilMensagens;
import beans.Grupo;
import beans.Projeto;
import jpa.EntityManagerUtil;

public class ProjetoDAO {

	private EntityManager em;

	public ProjetoDAO() {
		em = EntityManagerUtil.getEntityManager();
	}
	
	public List<Projeto> listarTodos(){
		return em.createQuery("from Projeto order by nome").getResultList();
	}
	
	public boolean gravar(Projeto obj){
		try{
			em.getTransaction().begin();
			if(obj.getId() == null){
				em.persist(obj);
			}else{
				em.merge(obj);
			}
			em.getTransaction().commit();
			UtilMensagens.mensagensInformacao("Objeto Persistido com sucesso");
			return true;
		}catch(Exception ex){
			if(em.getTransaction().isActive() == false){
				em.getTransaction().begin();
			}
			em.getTransaction().rollback();
			UtilMensagens.mensagensErro("Erro ao persistir objeto: "+UtilErros.getMensagemErro(ex));
			return false;
		}
	}
	
	public boolean excluir(Projeto obj){
		try{
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
			UtilMensagens.mensagensInformacao("Objeto removido com sucesso");
			return true;
		}catch(Exception ex){
			if(em.getTransaction().isActive() == false){
				em.getTransaction().begin();
			}
			em.getTransaction().rollback();
			UtilMensagens.mensagensErro("Erro ao remover objeto: "+UtilErros.getMensagemErro(ex));
			return false;
		}
	}
	
	public Projeto localizar(Integer id){
		return em.find(Projeto.class, id);
	}
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
