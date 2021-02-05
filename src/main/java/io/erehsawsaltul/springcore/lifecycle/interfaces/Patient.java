package io.erehsawsaltul.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter Method.");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void hi() {
		System.out.println("Inside Hi Method.");
	}

	public void bye() {
		System.out.println("Inside Bye Method.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet() Method.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy() Method.");
	}

}
