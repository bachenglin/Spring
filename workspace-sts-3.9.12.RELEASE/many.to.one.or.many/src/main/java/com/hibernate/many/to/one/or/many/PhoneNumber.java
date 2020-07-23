package com.hibernate.many.to.one.or.many;

public class PhoneNumber {
	private int pid;
	private String network;
	private String phonenumber;
	private Emp emp;

	public PhoneNumber() {
		System.out.println("PhoneNumber Object Created");
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
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

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "PhoneNumber [pid=" + pid + ", network=" + network + ", phonenumber=" + phonenumber + ", emp=" + emp
				+ "]";
	}
}
