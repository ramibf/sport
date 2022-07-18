package com.crocoder.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Matche {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Matche_ID")
	private Integer id;
	@Column
private String scoreOne;
	@Column
private String scoreTwo;
	@Column
	private String teamOne;
	@Column
	private String teamTwo;

public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

public Matche() {
	super();
}

public Matche(String scoreOne, String scoreTwo, String teamOne, String teamTwo) {
	super();
	this.scoreOne = scoreOne;
	this.scoreTwo = scoreTwo;
	this.teamOne = teamOne;
	this.teamTwo = teamTwo;
}

public String getScoreOne() {
	return scoreOne;
}

public void setScoreOne(String scoreOne) {
	this.scoreOne = scoreOne;
}

public String getScoreTwo() {
	return scoreTwo;
}

public void setScoreTwo(String scoreTwo) {
	this.scoreTwo = scoreTwo;
}

public String getTeamOne() {
	return teamOne;
}

public void setTeamOne(String teamOne) {
	this.teamOne = teamOne;
}

public String getTeamTwo() {
	return teamTwo;
}

public void setTeamTwo(String teamTwo) {
	this.teamTwo = teamTwo;
}

}
