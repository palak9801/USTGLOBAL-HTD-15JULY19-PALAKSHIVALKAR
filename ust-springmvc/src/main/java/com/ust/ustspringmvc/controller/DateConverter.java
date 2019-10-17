package com.ust.ustspringmvc.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	
	public static void main(String[] args) throws ParseException {
		
		String date = "19/01/1998";
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		
		Date d = format.parse(date);
		
		System.out.println(d.toString());
	}

}
