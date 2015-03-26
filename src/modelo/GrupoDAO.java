package modelo;

import java.util.List;

import javax.persistence.EntityManager;

import util.UtilErros;
import util.UtilMensagens;
import beans.Grupo;
import jpa.EntityManagerUtil;

public class GrupoDAO {

	private EntityManager em;

	public GrupoDAO() {
		em = EntityManagerUtil.getEntityManager();
	}
	
	public List<Grupo> listarTodos(){
		return em.createQuery("from Grupo order by nome").getResultList();
	}
	
	public boolean gravar(Grupo obj){
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
	
	public boolean excluir(Grupo obj){
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
	
	public Grupo localizar(Integer id){
		return em.find(Grupo.class, id);
	}
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
