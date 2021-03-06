package io.erehsawsaltul.springcore.lifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext cfx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcore/lifecycle/interfaces/lifecycleconfig.xml");
		Patient patient = (Patient) cfx.getBean("patient");
		System.out.println(patient);
		cfx.registerShutdownHook();
	}

}
 