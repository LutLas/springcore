package io.erehsawsaltul.springcore.innerbeans;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private int id;
	private Address address;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + 
				", House Number=" + address.getHouseNo() + 
				", Street=" + address.getStreet() + 
				", City=" + address.getCity() + 
				"]";
	}
}
