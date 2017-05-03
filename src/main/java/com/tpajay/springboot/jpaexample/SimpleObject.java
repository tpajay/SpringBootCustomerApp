package tpajay.springboot.jpaexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class SimpleObject {
	
	@Id
	@GeneratedValue
	int id;

	String fname;
	String lname;
	
	public SimpleObject(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getFname() {
		return this.fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getLname() {
		return this.lname;
	}	
}