package com.dev.ustglobal.oneToone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "votercard")
public class VoterCard {
	@Id
	@Column
	private int vid;
	@Column
	private String Vname;

	// bidirectional
	@OneToOne(mappedBy = "votercard")
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return Vname;
	}

	public void setVname(String vname) {
		Vname = vname;
	}

	@Override
	public String toString() {
		return "VoterCard [vid=" + vid + ", Vname=" + Vname + "]";
	}

}
