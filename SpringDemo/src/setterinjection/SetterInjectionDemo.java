package setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setterinjection/setterInjection.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
