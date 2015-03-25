package testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import beans.Setor;
import jpa.EntityManagerUtil;

public class TesteInserirSetor {
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerUtil.getEntityManager();
		
		Setor s = new Setor();
		s.setNome("Administrativo");
		Setor s2 = new Setor();
		s2.setNome("Operacional");
		
		em.getTransaction().begin();
		em.persist(s);
		em.persist(s2);
		em.getTransaction().commit();
		
		System.out.println("sucesso no insert");
	}
}
