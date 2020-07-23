package com.nagendra.com.hibernate;


import java.util.Map;


public class Emp {
	private String id;
	private String name;
	private Map<String,String> phoneno;
	public Emp(String name, Map<String, String> phoneno) 
	{
		this.name = name;
		this.phoneno = phoneno;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Map phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPhoneno()=" + getPhoneno() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	
	

	
}
