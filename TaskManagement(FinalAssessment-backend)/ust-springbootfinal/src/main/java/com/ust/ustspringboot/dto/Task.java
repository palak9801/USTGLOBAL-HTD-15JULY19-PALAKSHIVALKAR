package com.ust.ustspringboot.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="task_manager")
public class Task {
	
	
	@Id
	@Column
	@GeneratedValue
	private int task_id;
	
	@Column
	private String task;
	
	@GeneratedValue
	@JsonFormat(pattern ="dd-MM-yyyy")
	@CreationTimestamp
	private Date task_start_date;
	
	@GeneratedValue
	@JsonFormat(pattern ="dd-MM-yyyy")
	private Date task_end_date;

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Date getTask_start_date() {
		return task_start_date;
	}

	public void setTask_start_date(Date task_start_date) {
		this.task_start_date = task_start_date;
	}

	public Date getTask_end_date() {
		return task_end_date;
	}

	public void setTask_end_date(Date task_end_date) {
		this.task_end_date = task_end_date;
	}
	
	
	
	
	

}
