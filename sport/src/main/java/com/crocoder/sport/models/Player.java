package com.crocoder.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Player_ID")
	private Integer id;
	@Column
	private String name;
	@Column
	private String post;
	@Column
	private String team;
	@Column
	private int nb;
	public String getName() {
		return name;
	}
	public Player(String name, String post, String team, int nb) {
		super();
		this.name = name;
		this.post = post;
		this.team = team;
		this.nb = nb;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getNb() {
		return nb;
	}
	public void setNb(int nb) {
		this.nb = nb;
	}

}
