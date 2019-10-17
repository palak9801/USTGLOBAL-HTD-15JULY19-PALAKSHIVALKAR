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

import com.ust.ustspringboot.dto.Employee;
import com.ust.ustspringboot.dto.EmployeeResponse;
import com.ust.ustspringboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")   //allowCredential is use to pass cookies
public class EmployeeController {

	@Autowired
	@Qualifier("jpa")
	private EmployeeService service;
	
	@InitBinder
	public void  initBinder(WebDataBinder binder) {
		
		SimpleDateFormat format = new  SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		
		
	}
	
	@GetMapping(path="/get", produces = MediaType.APPLICATION_JSON_VALUE)  //produces  to produces JSON data
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {           //@ResponseBody is use to tell that it is a actual content
		                                                                               //it is difficult to specify it for each method therefore we will use @RestController to the class instead of Controller
		Employee employee = service.getEmployee(id);
		EmployeeResponse response = new EmployeeResponse();
		if(employee == null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not present ");
		}else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found ");
			response.setEmployees(Arrays.asList(employee));
		}
		return response;
		}
	                                                                  
	@GetMapping(path="/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(){
		
	List<Employee> employee =  service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		if(employee == null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not present ");
		}else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found ");
	        response.setEmployees(employee);
	        
		}
		
		return  response;
	}
	
	@PostMapping(path="/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {    //this annotation convert json or xml object into java object
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Added Successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Added ");
			}
		return response;
	}
	
	@PutMapping(path="/modify", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee( @RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.modifyEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Modified Successfully");
			
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Modified ");
		}
		return response;
	}
	
	@DeleteMapping(path="/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@PathVariable("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.removeEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Removed Successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Deleted ");
		}
		return response;
	}
	
	@GetMapping(path="/get-all-name", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployeesByName(@RequestParam("name")String name){
		
	List<Employee> employees =  service.getEmployeesByName(name);
		EmployeeResponse response = new EmployeeResponse();
		if(employees == null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not present ");
		}else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found ");
	        response.setEmployees(employees);
	        
		}
		
		return  response;
	}
	
	@GetMapping("/exce")
	public String throwException() throws Exception {
		throw new Exception();
		
	}
}
