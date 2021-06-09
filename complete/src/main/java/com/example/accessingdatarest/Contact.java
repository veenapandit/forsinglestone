package com.example.accessingdatarest;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contact {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne(cascade = CascadeType.ALL)
	private Name name;


	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Phone> phone;


	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	public Contact() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

    @OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}




}
