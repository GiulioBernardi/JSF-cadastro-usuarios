package br.com.fiap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
@SequenceGenerator(allocationSize = 1, name = "user", sequenceName = "sq_tb_user")
public class User {

	@Id
	@GeneratedValue(generator = "user", strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_user")
	private Long id;
	
	@Column(name = "nm_user")
	private String name = "Meu nome";
	
	@Column(name = "ds_email")
	private String email = "exemplo@gmail.com";
	
	@Column(name = "ds_password")
	private String passWord = "MinhaSenha123!!!";
	
	@Column(name = "nr_age")
	private Integer age = 30;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + this.name + ", email=" + this.email + ", passWord=" + this.passWord + ", age=" + this.age + "]";
	}

	
	
}
