package com.qa.HibernetApi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Members {

	@Id
	private int id;
	
	private int active;
	private String name, contact, address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Members [id=" + id + ", active=" + active + ", name=" + name + ", contact=" + contact + ", address="
				+ address + "]";
	}

	
	
	
}
