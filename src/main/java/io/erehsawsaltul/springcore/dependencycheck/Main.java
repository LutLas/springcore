package io.erehsawsaltul.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext cfx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcore/dependencycheck/dpc_config.xml");
		Prescription prescription = (Prescription) cfx.getBean("prescription");
		System.out.println(prescription);
	}

}
 