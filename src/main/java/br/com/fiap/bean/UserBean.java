package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.UserDAO;
import br.com.fiap.model.User;

@Named
@RequestScoped
public class UserBean {
	
	private User user = new User();
	
	public String save() {
		System.out.println(user);
		new UserDAO().create(user);
		
		FacesContext
			.getCurrentInstance()
			.addMessage(null, 
					new FacesMessage("New User added"));
		
		return "users";
	}
	
	public List<User> getUsers(){
		return new UserDAO().listAll();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}