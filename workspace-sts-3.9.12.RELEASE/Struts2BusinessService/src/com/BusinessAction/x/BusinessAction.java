package com.BusinessAction.x;
import com.BusinessService.x.BusinessServiceFinder;
public class BusinessAction 
{
  private String bestBusinessFinder;
  public String getBestBusinessFinder() {
		return bestBusinessFinder;
	}

	public void setBestBusinessFinder(String bestBusinessFinder) {
		this.bestBusinessFinder = bestBusinessFinder;
	}
  public String execute()
  {
	  BusinessServiceFinder bsf=new BusinessServiceFinder();
	  setBestBusinessFinder(bsf.getBestBusinessFinder());
	 /* String bestBusinessFinder=bsf.getBestBusinessFinder();
	  System.out.println(bestBusinessFinder);*/
	  // Ctrl+Shift+/---->Comment
	  return "success";
  }
}
