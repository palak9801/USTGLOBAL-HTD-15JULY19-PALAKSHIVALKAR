package com.dev.ustglobal.oneToone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class Person {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="v_id")
	private VoterCard votercard;
	
	
	public VoterCard getVotercard() {
		return votercard;
	}
	public void setVotercard(VoterCard votercard) {
		this.votercard = votercard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", votercard=" + votercard + "]";
	}
	
	

}
