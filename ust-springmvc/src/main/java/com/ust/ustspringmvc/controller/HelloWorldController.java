package com.ust.ustspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.ustspringmvc.dto.Employee;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@InitBinder               //to register custom editor
	public void  initBinder(WebDataBinder binder) {
		
		SimpleDateFormat format = new  SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		
		
	}
	
	
	// always return string from handler method
	@RequestMapping(path = "world", method = RequestMethod.GET)
	public String hello(ModelMap map) { // modelmap act likes request attribute, it is use to pass information by
										// default the scope is request
										// spring create the object of modelmap

		map.addAttribute("msg", "Helloooo.....");

		return "index";

		/*
		 * http://localhost:8080/ust-springmvc/hello
		 */
	}

	// if there are two handler method then we should create differernt path for the
	// methods to avoid ambiguity
	@RequestMapping(path = "/query", method = RequestMethod.GET)
	public String getInfo(@RequestParam("id") int id, @RequestParam("name") String name, ModelMap map) { // spring will
																											// convert
																											// the int
																											// id into
																											// string

		map.addAttribute("id", id);
		map.addAttribute("name", name);

		return "info";

		/*
		 * http://localhost:8080/ust-springmvc/hello/query?name=palak
		 */

		/********************************** form *****************************/
	}

	@RequestMapping(path = "/form-page", method = RequestMethod.GET) // this will display the form on request
	public String getForm() {

		return "form";
	}

	@RequestMapping(path = "/form", method = RequestMethod.POST) // id, name....sholud be same as that in the form name
	public String formData(/* int id, String name, String email, String password */ Employee emp, ModelMap map) {

		/*
		 * map.addAttribute("id", id); map.addAttribute("name", name);
		 * map.addAttribute("email", email); map.addAttribute("password", password);
		 */

		map.addAttribute("id", emp.getId()); // if there are more fields then it is difficult to write so we will create
												// a package as dto and then a class employee and include all the field
												// there as private
		map.addAttribute("name", emp.getName());
		map.addAttribute("email", emp.getEmail());
		map.addAttribute("dob", emp.getDob());
		map.addAttribute("password", emp.getPassword());

		return "info";

		/*
		 * http://localhost:8080/ust-springmvc/hello/form-page
		 */
	}

	/********************** cookie *************************************/

	@RequestMapping(path = "/add-cookie", method = RequestMethod.GET)
	public String addCookie(HttpServletResponse response, ModelMap map) {

		Cookie cookie = new Cookie("name", "palak");
		response.addCookie(cookie);
		map.addAttribute("msg", "cookie added to the browser");
		return "cookie";

		/*
		 * http://localhost:8080/ust-springmvc/hello/add-cookie
		 */
	}

	// to get the cookie
	// using required=false we tell that if the cookie if present return the cookie
	// value, but if it is not their return null value
	@RequestMapping(path = "/get-cookie", method = RequestMethod.GET)
	public String getCookie(@CookieValue(name = "name", required = false) String name, ModelMap map) {

		if (name == null) {
			map.addAttribute("msg", "cookie not present");
		} else {
			map.addAttribute("msg", "cookie name = " + name);
		}
		return "cookie";

		/*
		 * http://localhost:8080/ust-springmvc/hello/get-cookie
		 */
	}

	/******************** pathParam ****************************/

	@RequestMapping(path = "/path/{id}/{name}/{email}/{password}", method = RequestMethod.GET)
	public String getPathValues(@PathVariable("id") int id, @PathVariable("name") String name,
			@PathVariable("email") String email, @PathVariable("password") String password, ModelMap map) {

		map.addAttribute("id", id);
		map.addAttribute("name", name);
		map.addAttribute("email", email);
		map.addAttribute("password", password);

		return "info";

		/*
		 * http://localhost:8080/ust-springmvc/hello/path/qwerty
		 */
	}
	
	
	/*************************************************************************/

	@RequestMapping(path = "/set-attribute", method = RequestMethod.GET)
	public String setSessionAttribute(HttpSession session, ModelMap map) {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("palak");
		employee.setEmail("palak@gmail.com");
		employee.setPassword("palak");
		session.setAttribute("emp", employee);

		map.addAttribute("msg", "Session attribute added");

		return "index";

	}

	@RequestMapping(path = "/get-attribute", method = RequestMethod.GET)
	public String getSessionAttribute(@SessionAttribute(name="emp", required=false) Employee employee, ModelMap map) {

		if(employee==null) {
			map.addAttribute("msg", "no attribute present");
		} else {
			
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			
			map.addAttribute("msg", "Got the Attribute");
		}
		return "index";
	}

	@RequestMapping(path = "/forward", method=RequestMethod.GET)
	public String forward() {
		
		return "forward:add-cookie";
	}
	

	@RequestMapping(path = "/redirect", method=RequestMethod.GET)
	public String redirect() {
		
		return "redirect: http://www.google.com";
	}
	
	
}
