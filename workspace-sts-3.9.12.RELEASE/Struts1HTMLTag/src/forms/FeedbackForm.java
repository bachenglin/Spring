package forms;

public class FeedbackForm extends org.apache.struts.action.ActionForm
{
 private String name;
 private String gender;
 private String comments;
 public FeedbackForm()
 {
	 super();
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
 
}
