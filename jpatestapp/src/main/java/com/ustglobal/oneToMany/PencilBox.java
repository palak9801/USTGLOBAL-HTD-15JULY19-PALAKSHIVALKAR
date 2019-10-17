package com.ustglobal.oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PencilBox")
public class PencilBox {
	@Id
	@Column
	private int boxid;
	
	@Column
	private String bname;
	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="boxid", nullable = false)
	List<Pencils> pencils;

	public List<Pencils> getPencils() {
		return pencils;
	}

	public void setPencils(List<Pencils> pencils) {
		this.pencils = pencils;
	}

	public int getBoxid() {
		return boxid;
	}

	public void setBoxid(int boxid) {
		this.boxid = boxid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}
	
	

}
