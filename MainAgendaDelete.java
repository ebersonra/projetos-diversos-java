package com.algaworks.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.modelo.Agenda;

public class MainAgendaDelete {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agendaPU");
		EntityManager em = factory.createEntityManager();
		
		Agenda agenda = em.find(Agenda.class, 2L);
		
		em.getTransaction().begin();
		
		em.remove(agenda);
		
		em.getTransaction().commit();
		
		System.out.println("Agenda removida com sucesso!");

	}

}
