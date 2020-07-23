package com.hibernate.many.to.one.or.many;


	
	public class Emp {
		private int id;
		private String name;
		private PhoneNumber phoneno;

		public Emp() {
			System.out.println("Employee Object Created Successfully");
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

		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
		}
	
}
