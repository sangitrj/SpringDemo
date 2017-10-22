package inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Inheritance {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritance/inheritance.xml");
		Employee employee = (Employee) context.getBean("employee2");
		System.out.println(employee);
	}
}
