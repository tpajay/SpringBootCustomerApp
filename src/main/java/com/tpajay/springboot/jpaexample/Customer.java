package tpajay.springboot.jpaexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue
	long id;
	
	@Column(name="FNAME")
	String fname;
	
	@Column(name="LNAME")
	String lname;
	
	@Column(name="ADDRESS")
	String address;
	
	@Column(name="CITY")
	String city;
	
	@Column(name="STATE")
	String state;
	
	
	protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.fname = firstName;
        this.lname = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, fname, lname);
    }	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
