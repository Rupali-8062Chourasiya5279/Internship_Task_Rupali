package xmlmapping;

import java.util.Date;

public class User {
	
	private int uid;
	private String name;
	private String email;
	private String contact;
	private String city;
	private Date dob;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String name, String email, String contact, String city, Date dob) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.city = city;
		this.dob = dob;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", contact=" + contact + ", city=" + city
				+ ", dob=" + dob + "]";
	}

}
