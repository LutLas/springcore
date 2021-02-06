package io.erehsawsaltul.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Muyoba Lutlas
 *
 */
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext cfx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcore/constructorinjection/constinject_config.xml");
		Employee employee = (Employee) cfx.getBean("employee");
		System.out.println(employee);
		Ambiguity ambiguity = (Ambiguity) cfx.getBean("ambiguity");
		System.out.println(ambiguity);
	}
}
 