package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Address;
import bean.Employee;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {  
		//Resource resource=new ClassPathResource("config/applicationContext.xml");  
		//BeanFactory factory=new XmlBeanFactory(resource);  
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");  
		Employee employee=(Employee)factory.getBean("employeebean");  
		Address address = (Address)factory.getBean("addressbean");
		System.out.println("ID : "+employee.getEId());
		System.out.println("NAME : "+employee.getEname());
		System.out.println("list Name : "+employee.getNames());
		System.out.println("State : "+employee.getAddress().getState());
		System.out.println("City : "+employee.getAddress().getCity());
	} 
}
