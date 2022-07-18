package com.crocoder.sport.models;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import java.util.*;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_ID")
	private Integer id;
	@Column
private String  firstName;
	@Column

	private String  lastName;
	@Column
	private String email;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="USERS_ROLES",  joinColumns= { @JoinColumn(name="USER_ID")},   inverseJoinColumns= {@JoinColumn(name="ROLE_ID")})
	private List<Role> roles;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String firstName, String lastName, String email, String pwd) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pwd = pwd;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Column
	private String  pwd;

}
