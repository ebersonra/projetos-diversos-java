package com.algaworks.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.modelo.Agenda;

public class MainAgendaUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agendaPU");
		EntityManager em = factory.createEntityManager();
		
		Agenda agenda = em.find(Agenda.class, 2L);
		
		agenda.setNome("Julia Gomes");
		agenda.setTelefone("(22) 4439-2902");
		
		em.getTransaction().begin();
		em.persist(agenda);
		em.getTransaction().commit();
		
		System.out.println("Agenda atualizada com sucesso!");
	}

}
