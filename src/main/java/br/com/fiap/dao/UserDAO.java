package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.model.User;

public class UserDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro-persistence-unit");
	EntityManager manager = factory.createEntityManager();
	
	public void create(User user) {
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		manager.clear();
		
	}

	public List<User> listAll() {

		
		return manager.createQuery("SELECT u FROM User u", User.class)
				.getResultList();
		
		
	}
}