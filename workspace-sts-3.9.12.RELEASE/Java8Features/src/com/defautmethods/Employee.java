package com.defautmethods;

public interface Employee 
{
	public void populate();
	default void display()
	{
		System.out.println("Welcome to Marlabs");
	}
	default void process()
	{
		System.out.println("Info Processed.....");
	}
}
