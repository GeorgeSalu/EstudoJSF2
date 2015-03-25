package testes;

import java.util.Calendar;

import javax.persistence.EntityManager;

import beans.Funcionario;
import beans.Projeto;
import beans.ProjetoFuncionario;
import beans.Setor;
import jpa.EntityManagerUtil;

public class TesteInserirProjeto {
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerUtil.getEntityManager();
		
		Setor setor = em.find(Setor.class, 1);
		Funcionario funcionario = em.find(Funcionario.class, 1);
		
		Projeto projeto = new Projeto();
		projeto.setAtivo(true);
		projeto.setDescricao("projeto com jsf");
		projeto.setFim(Calendar.getInstance());
		projeto.setInicio(Calendar.getInstance());
		projeto.setNome("sistema de funcionarios");
		projeto.setSetor(setor);
		
		ProjetoFuncionario funcionario2 = new ProjetoFuncionario();
		funcionario2.setCargaHoraria(100);
		funcionario2.setInicioParticipacao(Calendar.getInstance());
		funcionario2.setFuncionario(funcionario);
		funcionario2.setGestor(true);
		funcionario2.setFimParticipacao(Calendar.getInstance());
		
		projeto.adicionarFuncionario(funcionario2);

		em.getTransaction().begin();
		em.persist(projeto);
		em.getTransaction().commit();
		
	}
}
