package io.erehsawsaltul.springcore.set;

import java.util.Set;

public class CarDealer {
	private String dealer;
	private Set<String> model;

	public String getDealer() {
		return dealer;
	}

	public void setDealer(String dealer) {
		this.dealer = dealer;
	}

	public Set<String> getModel() {
		return model;
	}

	public void setModel(Set<String> model) {
		this.model = model;
	}

}
