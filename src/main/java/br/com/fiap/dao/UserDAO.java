package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.model.User;

public class UserDAO {
	
	public void create(User user) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro-persistence-unit");
		
		EntityManager manager = factory.createEntityManager();
		manager.persist(user);
	
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		manager.clear();
	}

}
