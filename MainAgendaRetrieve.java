package com.algaworks.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.modelo.Agenda;

public class MainAgendaRetrieve {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agendaPU");
		EntityManager em = factory.createEntityManager();
		
		Agenda agenda = em.find(Agenda.class, 3L);
		
		System.out.println("Nome: " + agenda.getNome());

	}

}
