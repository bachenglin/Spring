package actions;

import java.util.ArrayList;

import javax.servlet.http.*;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.LabelValueBean;

import forms.CountryData;
import forms.InputForm;

public class InputAction extends DispatchAction 
{
	private final static String SUCCESS="success";
	private final static String DISPLAY="display";
	public ActionForward populate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	        throws Exception
	        { 
		       ArrayList countryList = new ArrayList();
		       ArrayList stateList = new ArrayList();
		       InputForm inputForm=(InputForm) form;
		       countryList.add(new CountryData("US", "USA"));
		       countryList.add(new CountryData("Canada", "Canada"));
		       countryList.add(new CountryData("China", "China"));
		       
		       stateList.add(new LabelValueBean("New York", "New York"));
		       stateList.add(new LabelValueBean("New Jersey", "New Jersey"));
		       stateList.add(new LabelValueBean("Beijing", "Beijing"));
		       
		       inputForm.setCountryList(countryList);
		       inputForm.setStateList(stateList);
		       return mapping.findForward(SUCCESS);
	        }
	public ActionForward save(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	        throws Exception
	        {
		       return mapping.findForward(DISPLAY);
	        }
}
