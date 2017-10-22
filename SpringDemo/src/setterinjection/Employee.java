package setterinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;  
	private String name;  
	private List<String> no;
	private Set<Integer> nos;
	private Map<Integer, String> pair;
	private Map<Key, Value> pairObject;
	private Address address;
	
	public int getId() {
		return id;
	}
		
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getNo() {
		return no;
	}

	public void setNo(List<String> no) {
		this.no = no;
	}

	public Set<Integer> getNos() {
		return nos;
	}

	public void setNos(Set<Integer> nos) {
		this.nos = nos;
	}

	public Map<Integer, String> getPair() {
		return pair;
	}

	public void setPair(Map<Integer, String> pair) {
		this.pair = pair;
	}

	public Map<Key, Value> getPairObject() {
		return pairObject;
	}

	public void setPairObject(Map<Key, Value> pairObject) {
		this.pairObject = pairObject;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", no=" + no + ", nos=" + nos + ", pair=" + pair
				+ ", pairObject=" + pairObject + ", address=" + address + "]";
	}

	
	
	
}
