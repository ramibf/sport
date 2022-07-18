package com.crocoder.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Team_ID")
	private Integer id;
	@Column
private String name ;
	@Column
	private String foundation;
	@Column
	private String staduim ;

public Team() {
	super();
	// TODO Auto-generated constructor stub
}

public Team(String name, String foundation, String staduim) {
	super();
	this.name = name;
	this.foundation = foundation;
	this.staduim = staduim;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFoundation() {
	return foundation;
}

public void setFoundation(String foundation) {
	this.foundation = foundation;
}

public String getStaduim() {
	return staduim;
}


public void setStaduim(String staduim) {
	this.staduim = staduim;
}
   

}
