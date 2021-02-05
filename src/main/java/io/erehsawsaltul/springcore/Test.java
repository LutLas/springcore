package io.erehsawsaltul.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.erehsawsaltul.springcore.list.Hospital;
import io.erehsawsaltul.springcore.map.Customer;
import io.erehsawsaltul.springcore.properties.CountriesAndLanguages;
import io.erehsawsaltul.springcore.reftypes.Student;
import io.erehsawsaltul.springcore.set.CarDealer;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		ClassPathXmlApplicationContext listctx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcore/list/list_config.xml");
		ClassPathXmlApplicationContext setctx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcore/set/set_config.xml");
		ClassPathXmlApplicationContext mapctx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcore/map/map_config.xml");
		ClassPathXmlApplicationContext propsctx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcore/properties/props_config.xml");
		ClassPathXmlApplicationContext reftypsctx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcore/reftypes/reftypes_config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		Hospital hospital = (Hospital) listctx.getBean("hospital");
		CarDealer carDealer = (CarDealer) setctx.getBean("dealers");
		Customer customer = (Customer) mapctx.getBean("customer");
		CountriesAndLanguages countryNLangs = (CountriesAndLanguages) propsctx.getBean("lang");
		Student student = (Student) reftypsctx.getBean("student");
		
		System.out.println("Employee ID: "+ emp.getId());
		System.out.println("Employee Name: "+ emp.getName());
		System.out.print("\n");
		System.out.println("Hospital Name: "+ hospital.getName());
		System.out.println("Hospital Departments: "+ hospital.getDepartments());
		System.out.print("\n");
		System.out.println("Car Dealer Name: "+ carDealer.getDealer());
		System.out.println("Car Models: "+ carDealer.getModel());
		System.out.print("\n");
		System.out.println(customer);
		System.out.print("\n");
		System.out.println(countryNLangs);
		System.out.print("\n");
		System.out.println(student);
	}

}
 