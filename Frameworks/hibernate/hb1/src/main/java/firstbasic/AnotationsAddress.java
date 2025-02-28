package firstbasic;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="address")
public class AnotationsAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "a_id")
	private int addressid;
	
	@Column(length = 5 , name="a_city" )
	private String city;
	
	@Column(length = 5,name = "a_street")
	private String street;
	
	@Column(name = "is_open")
	private boolean isopen;
	
	@Transient
	private double x;
	
	@Column(name="a_date")
	@Temporal(TemporalType.DATE)
	private Date datea;
	
	@Lob
	private byte[] img;
	public AnotationsAddress(int addressid, String city, String street, boolean isopen, double x, Date datea,
			byte[] img) {
		super();
		this.addressid = addressid;
		this.city = city;
		this.street = street;
		this.isopen = isopen;
		this.x = x;
		this.datea = datea;
		this.img = img;
	}
	public AnotationsAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getDatea() {
		return datea;
	}
	public void setDatea(Date datea) {
		this.datea = datea;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "AnotationsAddress [addressid=" + addressid + ", city=" + city + ", street=" + street + ", isopen="
				+ isopen + ", x=" + x + ", datea=" + datea + ", img=" + Arrays.toString(img) + "]";
	}
	

}
