package com.ustglobal.hotelbilling.HotelBillingg;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		HotelImp hi = new HotelImp();
		HotelImp hi2 = new HotelImp();

		Scanner sc = new Scanner(System.in);
		System.out.println(" 1: Menu Card");
		System.out.println(" 2:  take order ");
		System.out.println(" 3: operate ");
		System.out.println(" 4: total bill ");
		System.out.println("**************************");

		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1:
			hi.getAllData();
			System.out.println(" 1:  insert data");
			System.out.println(" 2:  edit ");
			System.out.println(" 3:  delete ");
			System.out.println("***************************");

			int choice2 = Integer.parseInt(sc.nextLine());
			switch (choice2) {
			case 1:
				System.out.println("insert data");
				hi.insert();
				break;
			case 2:
				System.out.println("edit data");
				hi.update();
				break;
			case 3:
				hi.deleteData();
				break;
			default:
			}
			break;
		case 2:
			System.out.println("order from customer or insert data");
			hi2.insert();
			break;
		case 3:
			System.out.println(" A: add food items");
			System.out.println(" B: remove food items");
			System.out.println(" C: modify food items");
			System.out.println("************************");

			int choice3 = Integer.parseInt(sc.nextLine());
			switch (choice3) {
			case 1:
				hi.insert();
				break;
			case 2:
				hi.deleteData();
				break;
			case 3:
				hi.update();
				break;
			default:
			}
			break;
		case 4:
			hi.bill();
			break;
		default:
		}
	}

}
