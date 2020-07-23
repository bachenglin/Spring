package com.inheititance.com.concrete;

public class RegEmp_Concrete  
{
	private float salay;
	private int bonus;
	public float getSalay() {
		return salay;
	}
	public void setSalay(float salay) {
		this.salay = salay;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "RegEmp_Concrete [salay=" + salay + ", bonus=" + bonus + ", getSalay()=" + getSalay() + ", getBonus()="
				+ getBonus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
