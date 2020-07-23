package com.demo;

public class ComputeService {
	
	ICompute comp;

	/**
	 * @return the comp
	 */
	public ICompute getComp() {
		return comp;
	}

	/**
	 * @param comp the comp to set
	 */
	public void setComp(ICompute comp) {
		this.comp = comp;
	}
	
	public int addNumbers(int x, int y) {
		return comp.add(x, y);
	}
	
	

}
