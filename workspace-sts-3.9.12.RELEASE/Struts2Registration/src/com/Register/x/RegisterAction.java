package com.Register.x;

public class RegisterAction
{
	String gender, email, name, password, country;
	
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String execute()
	{	
		int i = RegisterDAO.save(this);
		if (i>0)
		{
		return "success";
		}
		else
		{
			return "failure";
		}
	}
}
