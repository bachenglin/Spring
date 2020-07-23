package forms;

public class UserForm extends org.apache.struts.action.ActionForm {

	
	private String message;

	/**
     *
     */
	public UserForm() {
		super();
		
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
