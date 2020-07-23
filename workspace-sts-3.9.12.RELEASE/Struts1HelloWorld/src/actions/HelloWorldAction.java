package actions;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import forms.HelloWorldForm;

public class HelloWorldAction extends Action
{
  @Override
  public ActionForward execute(ActionMapping mapping,ActionForm form,
		  HttpServletRequest req,HttpServletResponse res)throws Exception
  {
	  HelloWorldForm helloWorldForm=(HelloWorldForm) form;
	  helloWorldForm.setMessage("Welcome to Marlabs");
	  return mapping.findForward("success");
  }
}