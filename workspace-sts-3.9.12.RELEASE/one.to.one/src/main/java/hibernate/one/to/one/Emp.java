package hibernate.one.to.one;

public class Emp 
{
	private int id;
	private String name;
	private PhoneNumber phoneno;
	public Emp()
	{
		System.out.println("Employee Object Created successfully");
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPhoneno()=" + getPhoneno() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PhoneNumber getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(PhoneNumber phoneno) {
		this.phoneno = phoneno;
	}
}
