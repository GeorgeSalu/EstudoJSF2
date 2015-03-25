package testes;

import java.util.Calendar;

import javax.persistence.EntityManager;

import beans.Funcionario;
import beans.Grupo;
import beans.Setor;
import jpa.EntityManagerUtil;

public class TesteInserirFuncionario {
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerUtil.getEntityManager();
		
		Grupo grupo = em.find(Grupo.class, 1);
		Setor setor = em.find(Setor.class, 1);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setAtivo(true);
		funcionario.setCpf("519.554.775-07");
		funcionario.setEmail("george.salu@gmail.com");
		funcionario.setGrupo(grupo);
		funcionario.setNascimento(Calendar.getInstance());
		funcionario.setNome("george");
		funcionario.setNomeUsuario("george");
		funcionario.setSalario(5000.00);
		funcionario.setSenha("123456");
		funcionario.setSetor(setor);
		
		em.getTransaction().begin();
		em.persist(funcionario);
		em.getTransaction().commit();
	}
}
