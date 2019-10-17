package com.ust.ustspringboot.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ustspringboot.dto.Task;
import com.ust.ustspringboot.repository.TaskRepository;

@Service("jpa")
public class TaskServiceJpaImpl implements TaskService {
	
	@Autowired
	TaskRepository repository;

	@Override
	public boolean addTask(Task task) {
		repository.save(task);
		return true;
	}

	@Override
	public boolean removeTask(int task_id) {
		repository.deleteById(task_id);
		return true;
	}

	@Override
	public boolean modifyTask(Task task) {
		Date date = new Date();
		repository.update(task.getTask_id(), date);
		return true;
	}

	@Override
	public Task getTask(int task_id) {
		
		return repository.findById(task_id).get();
	}

	@Override
	public List<Task> getAllTask() {
		
		return repository.findAll();
	}

}
