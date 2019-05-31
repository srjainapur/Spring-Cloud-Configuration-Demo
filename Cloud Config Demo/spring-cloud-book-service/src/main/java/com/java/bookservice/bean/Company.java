package com.java.bookservice.bean;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SC_COMPANY")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", length=10, unique=true, nullable=false)
	private Integer id;

	@Column(name="NAME", length=100, nullable=false)
	private String name;
	
	@Column(name="ADDRESS", length=150)
	private String address;
	
	@Column(name="PHONE_NO")
	private String phoneNo;
	
	@Embedded
	@AttributeOverrides(value={
			@AttributeOverride(name="firstName", column=@Column(name="CONTACT_FIRST_NAME")),
			@AttributeOverride(name="lastName", column=@Column(name="CONTACT_LAST_NAME")),
			@AttributeOverride(name="phone", column=@Column(name="CONTACT_PHONE_NO"))
	})
	private ContactPerson contactPerson;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public ContactPerson getContactPerson() {
		return contactPerson;
	}
	
	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}
}
