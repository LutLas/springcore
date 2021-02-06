package io.erehsawsaltul.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Muyoba Lutlas
 *
 */
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext cfx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcore/innerbeans/innerbeans_config.xml");
		Employee employee = (Employee) cfx.getBean("employee");
		System.out.println(employee.hashCode());
		
		Employee employee2 = (Employee) cfx.getBean("employee");
		System.out.println(employee2.hashCode());
	}
}
 