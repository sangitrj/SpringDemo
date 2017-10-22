package bean;

import java.util.List;

public class Employee {
	private String EId;
	private String Ename;
	private List<String> names;
	private Address address;
	
	public Employee(String id, String name, List<String> names, Address address) {
		this.EId = id;
		this.Ename = name;
		this.names = names;
		this.address = address;
	}
	
	public String getEId() {
		return EId;
	}
	public void setEId(String eId) {
		EId = eId;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
