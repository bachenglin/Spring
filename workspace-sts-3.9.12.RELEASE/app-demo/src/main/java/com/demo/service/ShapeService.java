package com.demo.service;

import com.demo.customeradvice.Loggable;
import com.demo.model.Circle;
import com.demo.model.Triangle;

public class ShapeService {
	
	Circle circle;
	Triangle triangle;
	
	@Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	

}
