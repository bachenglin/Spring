package com.nagendra.com.hibernate;

public class PhoneNumber
{
	private String pid;
	private String network;
	private String phonenumber;
	public PhoneNumber()
	{
		System.out.println("PhoneNumber Object is Created");
		
	}
	@Override
	public String toString() {
		return "PhoneNumber [pid=" + pid + ", network=" + network + ", phonenumber=" + phonenumber + ", getPid()="
				+ getPid() + ", getNetwork()=" + getNetwork() + ", getPhonenumber()=" + getPhonenumber()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
}
