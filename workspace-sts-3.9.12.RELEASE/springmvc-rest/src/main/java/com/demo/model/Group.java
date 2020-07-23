package com.demo.model;

import java.util.ArrayList;

public class Group {
	private String name;
	private ArrayList<User> list;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<User> getList() {
		return list;
	}

	public void setList(ArrayList<User> list) {
		this.list = list;
	}

}
