package io.erehsawsaltul.springcore.propsholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Muyoba Lutlas
 *
 */
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext cfx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcore/propsholder/propsholder_config.xml");
		MyDAO myDAO = (MyDAO) cfx.getBean("myDAO");
		System.out.println(myDAO);
	}

}
