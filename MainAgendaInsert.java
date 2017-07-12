package com.algaworks.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.modelo.Agenda;

public class MainAgendaInsert {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agendaPU");
		EntityManager em = factory.createEntityManager();
		
		Agenda agenda = new Agenda();
		
		agenda.setNome("Bia Gomes Silva");
		agenda.setTelefone("(44) 5542-0448");
		agenda.setDataRegistro(new Date());
		
		em.getTransaction().begin();
		em.persist(agenda);
		em.getTransaction().commit();
		
		System.out.println("==> Agenda salva com sucesso!");

	}

}
