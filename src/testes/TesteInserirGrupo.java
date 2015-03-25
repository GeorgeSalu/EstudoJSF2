package testes;

import javax.persistence.EntityManager;

import beans.Grupo;
import jpa.EntityManagerUtil;

public class TesteInserirGrupo {
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerUtil.getEntityManager();
		
		Grupo g = new Grupo();
		g.setNome("gestores");
		em.getTransaction().begin();
		em.persist(g);
		em.getTransaction().commit();
		
		
	}
}
