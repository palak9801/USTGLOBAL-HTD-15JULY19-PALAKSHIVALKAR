package com.dev.encapsulation;

public class Pets {
	@Override
	public String toString() {
		return "Pets [type=" + type + ", age=" + age + ", name=" + name + ", breed=" + breed + ", color=" + color + "]";
	}
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private int age;
	private String name;
	private String breed;
	private String color;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
