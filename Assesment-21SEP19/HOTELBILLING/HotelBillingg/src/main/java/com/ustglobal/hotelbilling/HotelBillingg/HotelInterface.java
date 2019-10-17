package com.ustglobal.hotelbilling.HotelBillingg;

import java.util.List;

import com.ustglobal.hotelbillingg.bean.Hotel;

public interface HotelInterface {
	
public boolean insert();
	
	public Hotel getData(int id);
	
	public boolean update();
	
	public boolean deleteData();
	
	public List<Hotel> getAllData();
	
	public List<Hotel> getnInsert();
	
	public Hotel addFood();
	
	public int bill(); 

}
