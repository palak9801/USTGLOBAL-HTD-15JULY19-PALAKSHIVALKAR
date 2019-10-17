package com.ust.ustspringboot.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.ustspringboot.dto.Task;
import com.ust.ustspringboot.dto.TaskResponse;
import com.ust.ustspringboot.service.TaskService;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "*")
public class TaskController {
	
	@Autowired
	@Qualifier("jpa")
	private TaskService service;
	
	@InitBinder
	public void  initBinder(WebDataBinder binder) {
		
		SimpleDateFormat format = new  SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		
		
	}
	
	@GetMapping(path="/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse getTask(@RequestParam("task_id")int task_id) {
		
		Task task = service.getTask(task_id);
		TaskResponse response = new TaskResponse();
		if(task == null) {
			//response.getStatus_code(401);
			response.setMessage("Failure");
			response.setDescription("Data not present ");
		}else {
			//response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found ");
			response.setTasks(Arrays.asList(task));
		}
		return response;
		}
	

@PostMapping(path="/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public TaskResponse addTask(@RequestBody Task task) {    
	TaskResponse response = new TaskResponse();
	if(service.addTask(task)) {
		//response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Data Added Successfully");
	}else {
		//response.setStatusCode(401);
		response.setMessage("Failure");
		response.setDescription("Data not Added ");
		}
	return response;
}


@PutMapping(path="/modify", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public TaskResponse modifyTask( @RequestBody Task task) {
	TaskResponse response = new TaskResponse();
	if(service.modifyTask(task)) {
		//response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Data Modified Successfully");
		
	}else {
		//response.setStatusCode(401);
		response.setMessage("Failure");
		response.setDescription("Data not Modified ");
	}
	return response;
}

@DeleteMapping(path="/remove/{task_id}", produces = MediaType.APPLICATION_JSON_VALUE)
public TaskResponse removeTask(@PathVariable("task_id")int task_id) {
	TaskResponse response = new TaskResponse();
	if(service.removeTask(task_id)) {
		//response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Data Removed Successfully");
	}else {
		//response.setStatusCode(401);
		response.setMessage("Failure");
		response.setDescription("Data not Deleted ");
	}
	return response;
}

@GetMapping(path="/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
public TaskResponse getAllEmployee(){
	
List<Task> task =  service.getAllTask();
	TaskResponse response = new TaskResponse();
	if(task == null) {
		//response.setStatusCode(401);
		response.setMessage("Failure");
		response.setDescription("Data not present ");
	}else {
		//response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Data found ");
        response.setTasks(task);
        
	}
	
	return  response;
}
}