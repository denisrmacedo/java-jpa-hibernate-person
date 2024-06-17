package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Buscar uma pessoa no banco de dados
		Pessoa p = em.find(Pessoa.class, 10);
		
		System.out.println(p);
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}
